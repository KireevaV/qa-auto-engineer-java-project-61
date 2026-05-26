package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = (int) (Math.random() * 100) + 1;
            String question = String.valueOf(number);
            String answer = (number % 2 == 0) ? "yes" : "no";
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.run("Welcome to the Brain Games!", rounds);
    }
}