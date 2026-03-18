import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    private int counterErrors;
    private static final int MAX_ERRORS = 6;
    private String secretWord;
    private String secretWordForConsole;

    public void determineBehavior(String userInput) {
        if (userInput.equals("с")) {
            System.out.println("Поехали!");
            start();
        }
        if (userInput.equals("в")) {
            System.out.println("До свидания!");
            System.exit(0);
        }
    }

    private void start() {
        List<String> missingLetters = new ArrayList<>();
        List<String> guessedLetters = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        makeWord();
        //       System.out.println(secretWord);                                       //Для теста.
        while (counterErrors < MAX_ERRORS) {
            printStateOfGame(secretWordForConsole, missingLetters);

            String letter = scanner.next();
            boolean secretWordContainsLetter = secretWord.contains(String.valueOf(letter));
            boolean missingLettersContainsLetter = missingLetters.contains(letter);

            if (Validator.isValid(String.valueOf(letter))) {

                if (secretWordContainsLetter || missingLettersContainsLetter) {

                    printWarning(missingLetters,guessedLetters,letter);
                    decipherLetters(letter);
                    guessedLetters.add(letter);
                } else {
                    counterErrors++;
                    missingLetters.add(letter);
                }

                if (gameWon(secretWord,secretWordForConsole)) {
                    printWinningMessage();
                    break;
                }
                if (counterErrors == MAX_ERRORS) {
                    printLossMessage();
                    break;
                }
            }
        }
        counterErrors = 0;
    }

    private boolean gameWon(String secretWord, String secretWordForConsole) {
        return secretWordForConsole.equals(secretWord);
    }

    private boolean repeatedInput(List<String> missingLetters, List<String> guessedLetters, String letter){
        return (missingLetters.contains(letter) || guessedLetters.contains(letter));
    }

    private void printWarning(List<String> missingLetters,List<String> guessedLetters, String letter) {
        if (repeatedInput(missingLetters,guessedLetters,letter)) {
            System.out.println("*****************************************");
            System.out.println("Такая буква уже есть.Будьте внимательнее!");
            System.out.println("*****************************************");
        }
    }

    private void makeWord() {
        Word word = new Word();
        secretWord = word.chooseRandomWord();
        secretWordForConsole = "*".repeat(secretWord.length());
    }

    private void printStateOfGame(String secretWordConsole, List<String> listMissingLetters) {
        System.out.println(Scaffold.draw(counterErrors));
        System.out.println("Загаданное слово: " + secretWordConsole);
        System.out.println("Ошибки: " + counterErrors + " " + listMissingLetters);
        System.out.println("Введите букву: ");
    }

    private void printWinningMessage() {
        System.out.println("***************************************************");
        System.out.println("Вы выйграли!" + "\n" +
                "Загаданное слово: " + secretWord + "\n" +
                "Количество ошибок, допущеных во время игры: " + counterErrors);
        System.out.println("***************************************************");
    }

    private void printLossMessage() {
        System.out.println(Scaffold.SIX);
        System.out.println("***************************************************");
        System.out.println("Вы допустили слишком много  ошибок. GAME OVER!!!" + "\n"
                + "Загаданное слово: " + secretWord);
        System.out.println("***************************************************");
    }

    private void decipherLetters(String letter) {
        for (int i = 0; i < secretWord.length(); i++) {
            if (letter.indexOf(secretWord.charAt(i)) != -1) {
                secretWordForConsole = secretWordForConsole.substring(0, i) +
                        secretWord.charAt(i) + secretWordForConsole.substring(i + 1);
            }
        }
    }
}
