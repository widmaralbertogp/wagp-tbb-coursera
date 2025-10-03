import java.util.Scanner;
public class Main
{
    static int choice = 0;
    // Initial position of the gear is P (i.e. Park) so, initializing variable gear with same
/*    public static String gear = "P";
    // Initial speed is set to 0, initializing variable speed with same
    public static int speed = 0;
    // Engine is initially off so the variable isEngineOn is set to false.
    public static boolean isEngineOn = false;
    // Getting user input via scanner class
*/ 
    public static Scanner keyBoard = new Scanner(System.in);
    
    // Starts the car simulation
    public static void startSimulation() {
        // Variable to control the display of the menu
        boolean displayMenu = true;
        int woption;    
        woption = 0;

        // Until the variable displayMenu is true this block will be executed

        while (displayMenu) 
        {
            //  Invoking displayDashboard method to showcase the current state of the car.
            displayDashboard(1);
//---------> displaySubMenuEspresso();

            // Get the user choice
            int choice = getUserChoice(woption);

            // Calling processChoice method by passing above integer as a parameter
            processChoice(choice);
            System.out.println();
        }
    }

    // displayDashboard method displays the car dashboard with current state and menu options
    public static void displayDashboard(int woption) 
    {
        if (woption == 1)
        {
            displayMainMemu();
        }        
        else if(woption == 2)
        {
            displaySubMenuEspresso();
        }
        else if (woption == 3)
        {
            displaySubMenuLatte();      
        }
    }    


    public static void displayMainMemu()
    {
        System.out.println("------ Coffe Machine ------");
        System.out.println("Menu:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Exit");          
    }

    public static void displaySubMenuEspresso()
    {
        System.out.println("-------------------");
        System.out.println(" Sub Menu Espresso:");
        System.out.println("1. What Roast would you like:");
        System.out.println("2. How many Servings would you like(a enter number please):");
        System.out.println("3. Return");        
    }
    public static void displaySubMenuLatte()
    {

    }
    

    // getUserChoice function has a return type int which stores the input received from the user
    public static int getUserChoice(int woption) 
    {
        // Gets the user's choice from the menu
        System.out.print("Enter your choice(1,2 or 3):");
        // Return the user's choice as an integer
//----->return keyBoard.nextInt();
        woption = keyBoard.nextInt();
        return woption;    
    }



    // Processes the user's choice from the menu
    public static void processChoice(int choice) {
        switch (choice) {
            // Toggle the engine state
            case 1:
                displaySubMenuEspresso();
                break;
            // Change the gear
            case 2:
                displaySubMenuLatte();
                break;
            // Accelerate the car
            case 3:
                
                break;
            // Apply the brakes
            case 4:
                
                break;
            // Exit/Terminate the simulation
            case 5:
                exitSimulation();
                break;
            // Handle the invalid choice (Any other input from the user except choices given above)
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
/*
    // Please implement toggleEngine() method which toggles the engine state, either turning it on or off
    public static void toggleEngine() {
        // Change the engine state here
        isEngineOn = !isEngineOn;

    }

    // Please implement changeGear() method that allows changing the gear according to user input
    public static void changeGear() {
        // Print a message here to ask for an input from user
        System.out.print("Enter gear (P,D,R): ");
        // Set the gear based on user input
        gear = keyBoard.next();

    }

    // Please implement accelerate() function that accelerates the car based on the condition.
    public static void accelerate() {
        // Add condition to check if the engine is on and the gear is not in Park (P)
        if (isEngineOn && !gear.equals("P"))
        {
            speed += 10;
        }
        else
        {
            // If the condition is not met, print a message stating acceleration is not possible
            System.out.println("The car is off or is parking now");
        }
    }

    // Please implement brake() function that applies the brake according to the condition
    public static void brake() {
        // Add condition to apply the brakes if the engine state is on and the speed is greater than 5
        //if (isEngineOn && !gear.equals("P") || gear.equals("R") ) {
        if (isEngineOn && speed > 5)
        {
            // Once above condition is met, decrease the speed by 5 units
            speed -= 5;
        } else {
            // If condition is not met, display error message
            System.out.println("Can not accelerate while is off or in Park (P) gear.");
        }
    }
*/
    // Please implement exitSimulation() function that terminates the simulation
    public static void exitSimulation() 
    {
        // Print an informative message about exiting the simulation here
        System.out.println("Thanks for driving in our car, see you soon");
        // Terminate the driving simulation
        System.exit(0);
    }




    public static void main(String[] args) 
    {
/*
        Espresso myEspresso = new Espresso("Mocachino", "Late", 2.5, 3);
        Latte myLatte = new Latte("Latte", "NoSe", 2.5, "Whole milk", "Hazelnut"); 

        myEspresso.grindBeans();
        myEspresso.brewCoffe();
        myEspresso.printInfo();
        myEspresso.printEspressoDetails();

        myLatte.grindBeans();
        myLatte.brewCoffe();
        myLatte.printInfo();
        myLatte.printLatteDetails();
 */
        startSimulation();
    }
}
