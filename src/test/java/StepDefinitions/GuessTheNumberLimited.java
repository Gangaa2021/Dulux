package StepDefinitions;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberLimited {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int maxAttempts = 5;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("🎮 Welcome to Guess the Number!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it!");

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                guessedCorrectly = true;
                break;
            }
        }

        if (guessedCorrectly) {
            System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("❌ Sorry! You've used all your attempts. The number was: " + numberToGuess);
        }

        scanner.close();
    }
}
