import java.util.Scanner;
public class GuessingGame
{
    	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in); // Scanner to read user input
        int secretNumber = 7;  // The secret number to guess
        int userGuess = 0;  // Variable to store the user's guess, initialized with 0

        // While loop that keeps running until the correct guess
        while (userGuess != secretNumber)
	{ // TODO 1 - Write the exit condition
            System.out.print("Guess the number from 1 to 9: ");
            // TODO 2: GET input from user
            userGuess = scanner.nextInt();
            if (userGuess != secretNumber)
	    {
                System.out.println("Wrong guess, try again!");
            }
        }

        // TODO 3: Congratulate the user once they guess correctly
        System.out.println("Congratulations you once the guess correctly!");
	scanner.close();
    }
}
