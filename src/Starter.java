import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Service game = new Service();

        while (true) {
            System.out.println("Введите" + "'" + "с" + "'" + ",чтобы начать игру или введите" + "'" + "в" + "'" + ",чтобы выйти из приложения.");
            String userInput = scanner.nextLine();
            if (Validator.isValid(userInput)) {
                game.determineBehavior(userInput);
            }
        }
    }
}
