import java.util.Scanner;
import java.util.regex.MatchResult;

public class mnuOptScanner
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int dayOfTheWeek;
        int subChoice;
        Scanner in = new Scanner(System.in);
        char ToBeContinue;
        do 
        {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("********** MENU *****************");
            System.out.println("1. Delimitadores Distintos a espacio en blanco");
            System.out.println("2. Misma salida utilizando expresión regular para analizar los 4 tokens de una");
            System.out.println("3. WEDNESDAY");
            System.out.println("4. THURSDAY");
            System.out.println("5. FRIDAY");
            System.out.println("6. SATURDAY");
            System.out.println("7. SUNDAY");
            System.out.println("***********************************");
            System.out.print("These are the choices for week of the day. \\n Please enter only values from 1-7: ");
            dayOfTheWeek = keyboard.nextInt();
            System.out.println("***********************************");
            switch (dayOfTheWeek) {
                case 1:
                    miMetodo(1);
                    break;
                case 2:
                    miMetodo(2);
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
            System.out.print("Do you want to continue [Y/N]: ");
            ToBeContinue = in.next().charAt(0);
            System.out.println("========================================");
        } while (ToBeContinue == 'y' || ToBeContinue == 'Y');
        if (ToBeContinue == 'n' || ToBeContinue == 'N') 
        {
            System.out.println("Finished Program.");
        } else 
        {
            System.out.println("Error [y] or [n] was waiting");
        }
        in.close();

        int checkVal = 15;
        if (checkVal == 12) 
        {
            System.out.println("A");
        }
        int i;
        for (i = 1; i <= 5; i++) 
        {
            System.out.println(" " + i);
        }
        System.out.println(" # " + i);
    }

    public static void miMetodo(int numeros) 
    {
       
        if (numeros == 1) 
        {
            String input = "1 fish 2 fish red fish blue fish";
            Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
            System.out.println(s.nextInt());
            System.out.println(s.nextInt());
            System.out.println(s.next());
            System.out.println(s.next());
            s.close();
        }
        else if (numeros == 2) 
        {
            String input = "1 fish 2 fish red fish blue fish";
            Scanner s = new Scanner(input);
            s.findInLine("(\\d+) fish (\\d+) fish (\\w+) fish (\\w+)");
            MatchResult result = s.match();
            for (int i=1; i<=result.groupCount(); i++)
                System.out.println(result.group(i));
            s.close();
        }
    }
}
