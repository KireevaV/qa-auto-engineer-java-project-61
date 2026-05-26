package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            Cli.greet();
        } else if (choice == 2) {
            Even.play();
        } else if (choice == 3) {
            Calc.play();
        } else if (choice == 0) {
            System.out.println("Goodbye!");
        } else {
            System.out.println("Invalid choice. Please run the program again.");
        }

        scanner.close();
    }
}