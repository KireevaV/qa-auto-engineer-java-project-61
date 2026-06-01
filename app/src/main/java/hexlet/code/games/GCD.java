package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = (int) (Math.random() * 50) + 1;
            int b = (int) (Math.random() * 50) + 1;
            String question = a + " " + b;
            int correctAnswer = gcd(a, b);
            rounds[i][0] = question;
            rounds[i][1] = String.valueOf(correctAnswer);
        }

        Engine.run(
                "Find the greatest common divisor of given numbers.",
                rounds
        );
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}