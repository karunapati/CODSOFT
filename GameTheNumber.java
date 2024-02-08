package Codsoft;

import java.util.Scanner;
import java.util.Random;

public class GameTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();

        int min = 1;
        int max = 100;
        int attempts = 0;
        int round = 0;
        boolean playAgain = true;

        System.out.println("Welcome to Guess the Number!");

        while (playAgain) {
            int target = ran.nextInt(max - min + 1) + min;
            attempts = 0;
            round++;
            System.out.println("I have selected a number between " + min + " and " + max + ". Guess what it is!");
            do {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess < target) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > target) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed it right: " + target);
                    System.out.println("Total attempts: " + attempts + " attempts!");
                    break;
                }
            } while (true);

            System.out.print("\nDo you want to play the game again? (yes/no): ");
            String playGameAgain = scanner.next().toLowerCase();
            if (!playGameAgain.equals("yes")) {
                playAgain = false;
                System.out.println("Thank you for playing");
                System.out.println("Total round:" + round);
                double averageAttempts = (double) attempts / round;
                System.out.printf("Average attempts per round: %.2f%n", averageAttempts);
            }
        }

        scanner.close();
    }
}
