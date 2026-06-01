package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        char[] operations = {'+', '-', '*'};

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = (int) (Math.random() * 20) + 1;
            int b = (int) (Math.random() * 20) + 1;
            char op = operations[(int) (Math.random() * operations.length)];

            String question = a + " " + op + " " + b;
            int result = calculate(a, b, op);
            String answer = String.valueOf(result);

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.run("What is the result of the expression?", rounds);
    }

    private static int calculate(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            default: throw new IllegalArgumentException("Unknown operation: " + op);
        }
    }
}