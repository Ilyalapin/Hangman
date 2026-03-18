public class Service {
    private int counterErrors;
    private static final int MAX_ERRORS = 6;
    private String secretWord;
    private String secretWordForConsole;

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
