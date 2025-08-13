import java.util.Scanner;

public class EjemploInputPrintln {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear una instancia de Scanner para leer la entrada

        System.out.print("Ingrese su nombre: "); // Mostrar un mensaje al usuario

        String nombre = scanner.nextLine(); // Leer una línea completa de texto del usuario

        System.out.println("Hola, " + nombre + "! Bienvenid@ a nuestro programa."); // Imprimir la entrada del usuario
    }
}
