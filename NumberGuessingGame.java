import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int secretNumber = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        int maxAttempts = 5;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + min + " and " + max);

        while (attempts < maxAttempts) 
        {
            
            System.out.print("Guess a number: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) 
            
            {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                score++;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (attempts >= maxAttempts) 
        {
            System.out.println("Sorry, you ran out of attempts. The secret number was: " + secretNumber);
        }

        System.out.println("Your final score is: " + score);

        // Option for multiple rounds
        System.out.print("Would you like to play again? (yes/no): ");
        String playAgain = scanner.next();
        if (playAgain.equalsIgnoreCase("yes")) {
            main(args); // Start a new game
        } else {
            System.out.println("Thanks for playing!");
        }
    }
}