package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void run(String gameName, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(gameName);
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String question = rounds[i][0];
            String correctAnswer = rounds[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(
                        "'" + userAnswer
                                + "' is wrong answer ;(. Correct answer was '"
                                + correctAnswer
                                + "'."
                );
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }


        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}