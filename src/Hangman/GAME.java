package Hangman;

import java.util.Scanner;

public class GAME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите" + "'" + "с" + "'" + ",чтобы начать игру или введите" + "'" + "в" + "'" + ",чтобы выйти из приложения.");
            String i = scanner.nextLine();
            if (i.equals("с")) {
                System.out.println("Поехали!");
                GameCore.implementationGame();
            }

                if (i.equals("в")) {
                    System.out.println("До свидания!");
                    System.exit(0);
                }

        }
    }
}




