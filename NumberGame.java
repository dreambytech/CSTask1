package task1;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public void start() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int number = rand.nextInt(100) + 1;
            int attempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("Guess the number (between 1 and 100). You have " + attempts + " attempts.");

            for (int i = 0; i < attempts; i++) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                System.out.println("Attempts remaining: " + (attempts - i - 1));
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you're out of attempts! The correct number was: " + number);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
