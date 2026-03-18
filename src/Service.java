import java.util.List;

public class Service {
    private int counterErrors;
    private static final int MAX_ERRORS = 6;
    private String secretWord;
    private String secretWordForConsole;

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
