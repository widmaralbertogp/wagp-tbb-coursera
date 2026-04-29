import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        // TODO 1: Declare the necessary variables for the car's state and add scanner object
         boolean isEngineOn = false;
         String gear = "P";
         int speed = 0;
         int choice = 0;
         Scanner keyBoard = new Scanner(System.in);
    while(choice !=5)
    {
    // TODO 2: Display the current state of the car (engine state, gear, speed)
    System.out.println("----------------- Car Dashboard ---------------");
    System.out.println("Speed: " + speed);
    System.out.println("The gear is: " + gear);
    System.out.println("Engine State: " + isEngineOn);
    // TODO 3: Add print statements for each variable you want to display or options available to the user
    System.out.println("----------- Menu ------------");
    System.out.println("1. Turn on/off the engine");
    System.out.println("2. Change gear (P, D, R)");
    System.out.println("3. Accelerate");
    System.out.println("4. Brake");
    System.out.println("5. Exit");
    System.out.println("----------- Messages for drivers ------------");
    // TODO 4: Prompt the user for their choice and store it in the 'choice' variable
    System.out.print("Enter your choice: ");
    choice = keyBoard.nextInt();
    // TODO 5: Implement a switch statement to handle the different menu choices
    switch (choice) 
    {
        case 1:
            isEngineOn = !isEngineOn;
            break;
        case 2:
            System.out.print("Enter gear (P, D, R): ");
            gear = keyBoard.next();
            break;
        case 3:
            if (isEngineOn && !gear.equals("P"))
            {
                if (speed < 90)
                {
                    speed += 10;
                }
                else
                {
                    System.out.println("You're not allowed to exceed 90 kph");
                }
            }
            else
            {
                System.out.println("Cannot accelerate while is off or in Park (P) gear.");
            }
            break;
        case 4:
            if (isEngineOn && gear.equals("P") || gear.equals("R")) {
                speed += 0;
            } else {
                System.out.println("Cannot brake while is off or in Park (P) gear.");
            }
            break;
        default:
            if (isEngineOn)
            {
                System.out.println("Don't forget to turn off the car before getting out");
                choice = 0;
                break;
            }
            else if (!gear.equals("P"))
            {
                System.out.println("Don't forget to park the car before getting out");
                choice = 0;
                break;
            }
            else if (isEngineOn && speed == 0 && gear.equals("P"))
            {
                System.out.println("Thanks for drive in this program");
                choice = 5;
                break;
            }
    }
    // TODO 6: Make sure the program runs until the user decides it's time to stop. Consider enclosing TODO 2 -> TODO 5 above in a while loop!
    }
    }
}