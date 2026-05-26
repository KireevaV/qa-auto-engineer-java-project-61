package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int length = (int) (Math.random() * (MAX_LENGTH - MIN_LENGTH + 1)) + MIN_LENGTH;
            int start = (int) (Math.random() * 20) + 1;
            int step = (int) (Math.random() * 5) + 1;
            int hiddenIndex = (int) (Math.random() * length);

            String[] progression = generateProgression(start, step, length);
            int correctAnswer = Integer.parseInt(progression[hiddenIndex]);
            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);
            rounds[i][0] = question;
            rounds[i][1] = String.valueOf(correctAnswer);
        }

        Engine.run("Welcome to the Brain Games!\nWhat number is missing in the progression?", rounds);
    }

    private static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }
}