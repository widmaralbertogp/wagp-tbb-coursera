import java.util.Scanner;
public class Main 
{
   /* public static void process()
    {
        SideKick sideKickObject = new SideKick(); 
       


        Scanner in = new Scanner(System.in);
        char ToBeContinue;        
        do 
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();     
            sideKickObject.setChoice();
            System.out.println("");           
            System.out.print("Do you want to continue [Y/N]: ");ToBeContinue = in.next().charAt(0);
        } 
        while(ToBeContinue == 'y' || ToBeContinue == 'Y');
        if(ToBeContinue == 'n' || ToBeContinue == 'N')
        {
            System.out.println("Finished Program.");
            in.close();
        }
        else
            System.out.println("Error [y] or [n] was waiting");
    }
            */
    public static void main(String[] args) 
    {   
         WatADriver driverBot = new WatADriver();
         //driverBot.rechargeBattery();
         //driverBot.displayBatteryLevel();
         driverBot.setChoice();
         driverBot.takeAction();
        //System.out.println("Mode of operation is: " + sideKickObject.modeOfOperation);
        //System.out.println("The value of modeOfOperation is: " + sideKickObject.getModeOfOperation());
        // sideKickObject.setModeOfOperation(3);
        //sideKickObject.takeAction();
        //sideKickObject.setModeOfOperation(1);
        //sideKickObject.takeAction();
        //sideKickObject.setModeOfOperation(2);
        //sideKickObject.takeAction();
        //int choice;
        //choice = 0;
        //process();
    }
}