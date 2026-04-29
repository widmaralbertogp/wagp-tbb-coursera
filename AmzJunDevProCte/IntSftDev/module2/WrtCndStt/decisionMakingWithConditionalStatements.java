import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
	System.out.print("\033[H\033[2J");  
	System.out.flush();  
	Scanner entrada = new Scanner(System.in);
	System.out.print("Ingrese un entero mayor o menor a 300: ");
	int moneyLeftWithToni = entrada.nextInt();

        if( moneyLeftWithToni >= 300 ) {
            System.out.println("Go to Las Vegas");
        }

        System.out.println("On trip to parents.");
    }
}
