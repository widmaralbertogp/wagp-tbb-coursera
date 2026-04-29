import java.util.Scanner;
public class Main 
{ 
    
	public static void main(String[] args)
     { 
   //1(a): Put your if-statement here to check if moneyLeftWithToni> =300.
	System.out.print("\033[H\033[2J");  
	System.out.flush();  
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un entero mayor o menor a 300: ");
        int moneyLeftWithToni = entrada.nextInt();
        /*
        int moneyLeftWithToni = 299;*/
        System.out.println("Usted ingresos: " + moneyLeftWithToni);
       if( moneyLeftWithToni >= 300 ) 
       {
            System.out.println("-----------------------------");
            System.out.println("Go to Las Vegas");
            System.out.println("Enjoy some luck games");
            System.out.println("Enjoy some concerts");
            System.out.println("Enjoy fine dining");
            System.out.println("Go on a helicopter ride");
            System.out.println("Go shop for some souvenirs");
            System.out.println("-----------------------------");

        }
   //1(b): Put the display statements within the curly braces of the if.       
        if( moneyLeftWithToni < 300 ) 
        { 
            System.out.println("-----------------------------");
            System.out.println("On trip to parents.");
        }
     }
 }
