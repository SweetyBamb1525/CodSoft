import java.util.Scanner;
import java.util.Random;

public class Number_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowestRange = 1;
        int highestRange = 100;
        int highestAttempts = 10;
        int score = 0;

        System.out.println("NUMBER GUESSEING GAME*");
        System.out.println("Welcome player!! \n Play and Enjoy ");
        System.out.println("10 Attempts for guessesing correct number");
        System.out.println("Guess number between 1 to 100.");


        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(highestRange - lowestRange + 1) + lowestRange;
           
            System.out.println("I've selected a number between " + lowestRange + " and " + highestRange + ". Guess it!");
            int attempts = 0;
            boolean guessedCorrectly = false;

            while (attempts < highestAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guessNumber = scanner.nextInt();
                attempts++;

                if (guessNumber == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                } else if (guessNumber < numberToGuess) {
                    System.out.println("Your gussesing number is too low!. Try again, Hope So Better Luck Next Time!!");
                } else {
                    System.out.println("Your guessing number is too high!. Try again, Hope So Better Luck Next Time!!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The number was: " + numberToGuess);
            }

            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next();
            playAgain = playAgainResponse.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
