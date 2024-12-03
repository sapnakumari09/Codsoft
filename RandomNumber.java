import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class RandomNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do {
            playGame(scanner, random);

            System.out.print("Play Again? (y/n): ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    public static void playGame(Scanner scanner, Random random) {
        int secretNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100 (inclusive)
        int attempts = 5; // Set number of attempts
        while (attempts > 0) {
            System.out.printf("Guess a number between 1 and 100 (Attempts left: %d): ", attempts);

            try {
                int guess = scanner.nextInt();
                scanner.nextLine(); // Consume newline character after integer input

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the number in " + (attempts) + " attempts.");
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            } catch ( InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input from scanner buffer
            }
            attempts--;
        }

        if (attempts == 0) {
            System.out.println("Sorry, you ran out of attempts. The secret number was " + secretNumber + ".");
        }

    }
}
