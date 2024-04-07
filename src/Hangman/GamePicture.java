package Hangman;

public class GamePicture {
    public static void  zeroPosition() {
        System.out.print("""
                         _______
                         |     |
                               |
                               |
                               |
                               |
                ----------------
                          """);

    }
    public static void error1() {
        System.out.print("""
                         _______
                         |     |
                         O     |
                               |
                               |
                               |
                ----------------
                          """);
    }
    public static void error2() {
        System.out.print("""
                         _______
                         |     |
                         O     |
                         |     |
                         |     |
                               |
                ----------------
                          """);
    }
    public static void error3() {
        System.out.print("""
                         _______
                         |     |
                         O     |
                      ---|     |
                         |     |
                               |
                ----------------
                          """);
    }
    public static void error4() {
        System.out.print("""
                         _______
                         |     |
                         O     |
                      ---|---  |
                         |     |
                               |
                ----------------
                          """);
    }
    public static void error5() {
        System.out.print("""
                         _______
                         |     |
                         O     |
                      ---|---  |
                        _|     |
                       _|      |
                ----------------
                          """);
    }
    public static void error6() {
        System.out.print("""
                         _______
                         |     |
                         O     |
                      ---|---  |
                        _|_    |
                       _| |_   |
                ----------------
                          """);
    }

}
