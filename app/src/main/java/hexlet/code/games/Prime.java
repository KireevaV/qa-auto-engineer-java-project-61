package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = (int) (Math.random() * 50) + 1;
            String question = String.valueOf(number);
            String answer = isPrime(number) ? "yes" : "no";
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.run(
                "Answer 'yes' if given number is prime. Otherwise answer 'no'.",
                rounds
        );
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}