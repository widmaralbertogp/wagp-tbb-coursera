import java.util.Scanner;
public class Main {
    public static void main(String []args) {
        Scanner keyboard = new Scanner(System.in);
        int dayOfTheWeek;
        int subChoice;
        Scanner in = new Scanner(System.in);
        char ToBeContinue;
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("********** MENU *****************");
            System.out.println("1. MONDAY");
            System.out.println("2. TUESDAY");
            System.out.println("3. WEDNESDAY");
            System.out.println("4. THURSDAY");
            System.out.println("5. FRIDAY");
            System.out.println("6. SATURDAY");
            System.out.println("7. SUNDAY");
            System.out.println("***********************************");
            System.out.print("These are the choices for week of the day. \\n Please enter only values from 1-7: ");
            dayOfTheWeek = keyboard.nextInt();
            System.out.println("***********************************");
            switch (dayOfTheWeek)
	    {
                case 1:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("********** MENU *****************");
                    System.out.println("1. MONDAY");
                    System.out.println("2. TUESDAY");
                    System.out.println("*********************************");
                    System.out.print("Select 1 for Monday or 2 for Tuesday: ");
                    subChoice = keyboard.nextInt();
                    if (subChoice == 1) {
                        System.out.println("Monday: It is back to work.....");
                        System.out.println("Good.Now you have a catchup meeting at 9 AM Prepare your notes");
                    } else if (subChoice == 2) {
                        System.out.println("Lets us divert on Highway 54 and have a Burger on the drive in");
                    } else {
                        System.out.println("NO such choice available");
                    }
                    break;
                case 2:
                    System.out.println("Tuesday: It is back to work.....");
                    break;
                case 3:
                    System.out.println("Wednesday: It is back to work.....");
                    break;
                case 4:
                    System.out.println("Thursday: It is back to work.....");
                    break;
                case 5:
                    System.out.println("Friday: It is back to work.....");
                    break;
                case 6:
                    System.out.println("Saturday: It is back to work.....");
                    break;
                case 7:
                    System.out.println("Sunday: It is back to work.....");
                    break;
                default:
                    if (dayOfTheWeek < 1) {
                        System.out.println("The number is less than 1");
                    } else if (dayOfTheWeek > 7) {
                        System.out.println("The number is greater than 7");
                    }
            }
            System.out.println("");
            System.out.println("========================================");
            System.out.print("Do you want to continue [Y/N]: ");ToBeContinue = in.next().charAt(0);
            System.out.println("========================================");
        } while(ToBeContinue == 'y' || ToBeContinue == 'Y');
        if(ToBeContinue == 'n' || ToBeContinue == 'N')
        {
            System.out.println("Finished Program.");
        }
        else
            System.out.println("Error [y] or [n] was waiting");
            in.close();

	int checkVal = 15;
       	if(checkVal == 12) 
	{
           System.out.println("A");
       	}
	int i;
	for(i=1; i <= 5 ; i++)
	    System.out.println(" " + i);
	    System.out.println(" # " + i);

    } 
}
