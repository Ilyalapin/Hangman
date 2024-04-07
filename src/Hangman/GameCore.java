package Hangman;

import java.util.*;
public class GameCore {
    static String secretWord;                  // загаданное слово.
    static String secretWordConsol;           //  отображение загаданного слова в консоли.
    static int counterErrors;                    // счетчик ошибок.
    static List<Character> listMissingLetters;          // отображение отсутствующих в слове букв.



    public static void implementationGame() {
        Scanner scanner = new Scanner(System.in);
        listMissingLetters = new ArrayList<>();
        GamePicture.zeroPosition();
        Words word = new Words();
        secretWord = word.randomWords();
        secretWordConsol = "_".repeat(secretWord.length());
 //       System.out.println(secretWord);                                       //Для теста.
        while (counterErrors !=6){
            System.out.println("Загаданное слово: " + secretWordConsol);
            System.out.println("Ошибки: " + counterErrors + " " + listMissingLetters);
            System.out.println("Введите букву: ");
            char letter = scanner.next().charAt(0);

            if (secretWordConsol.contains(String.valueOf(letter))) {
                System.out.println("Такая буква уже есть.Будьте внимательнее!");
                listMissingLetters.add(letter);
            }
            if (secretWord.contains(String.valueOf(letter))) {
                for (int i = 0; i < secretWord.length(); i++) {
                    if (secretWord.charAt(i) == letter) {
                        secretWordConsol = secretWordConsol.substring(0, i) + letter + secretWordConsol.substring(i + 1);
                    }
                }
            } else {
                counterErrors++;
                listMissingLetters.add(letter);
            }

            switch (counterErrors) {
                case 0 :
                    GamePicture.zeroPosition();
                    break;
                case 1:
                    GamePicture.error1();
                    break;
                case 2:
                    GamePicture.error2();
                    break;
                case 3:
                    GamePicture.error3();
                    break;
                case 4:
                    GamePicture.error4();
                    break;
                case 5:
                    GamePicture.error5();
                    break;
                case 6:
                    GamePicture.error6();
                    System.out.println("Вы допустили слишком много  ошибок. GAME OVER!!!"+"\n"+"Загаданное слово: "+secretWord);
                   break;
            }
            if (secretWordConsol.equals(secretWord)){
                System.out.println("Поздравляем ! Вы выйграли !"+"\n"+"Загаданное слово: "+secretWord+"\n"+"Количество ошибок, допущеных во время игры: "+ counterErrors);
                break;
            }
        }
    }
}






