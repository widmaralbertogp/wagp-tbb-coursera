import java.util.Scanner;
public class SideKick extends Robot
{
    /** Object of Scanner class to input values from the user */
     
   // Scanner keyboard;
    // method to set choice
    public void setChoice() 
    {
         System.out.println("***** SideKick Menu *****");
         System.out.println("1. Cleaning");
         System.out.println("2. Cooking");
         System.out.println("3. Re-charge");         
         System.out.print("Enter choice(1-3): ");
         int choice = keyboard.nextInt();
         //modeOfOperation = choice;
         setModeOfOperation(choice);
         takeAction();         
     }

     // method to take action
     public void takeAction() 
     {
        switch (getModeOfOperation()) 
        {
            case 1:
                cleanHouse();
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("Status Mode of Operation: SideKick cleaning completed.");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                break;
            case 2:
                cookFood();
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("Status Mode of Operation: SideKick cooking completed.");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                break;
            case 3:
                rechargeBattery();
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                System.out.println("Status Mode of Operation: SideKick recharged battery.");
                System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
                break;
            default:
                System.out.println("SideKick does not support the operation.");
        }
     }


    // method to clean the house from public to private
    /*public  private void cleanHouse() */
    private void cleanHouse() 
    {
        System.out.println("---------------- Cleaning the House ------------------------");        
        System.out.println("Get the vacuum cleaner.....");
        System.out.println("Put the dust bag in vacuum.....");
        System.out.println("Go to Living room and clean.....");
        System.out.println("Go to bedroom and clean.....");
        System.out.println("Go to kitchen and clean.....");
        System.out.println("Go to bathroom and clean.....");
        System.out.println("Retrieve dust bag from vacuum cleaner and put in bin.....");
        System.out.println("Go back to Toni.....");
        
    }
    
    private void cookFood()     
    {
        System.out.println("---------------- Cooking Food ------------------------");        
        System.out.println("Move to the kitchen...........");
        System.out.println("Get the vegetables...........");
        System.out.println("Cut the vegetables...........");
        System.out.println("Turn on the gas...........");
        System.out.println("Get the cooking pan and oil ready...........");
        System.out.println("Cook the food...........");
        System.out.println("Turn off the gas...........");
        System.out.println("Get it ready on the plate...........");
        System.out.println("Go back to Toni...........");
    }    
    /*private void exitSideKick()
    {
        return;
    }*/
}