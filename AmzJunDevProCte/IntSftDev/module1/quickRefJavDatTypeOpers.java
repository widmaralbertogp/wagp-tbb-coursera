public class TodoEjemplo {
    public static void main(String[] args) {
        // Declaración de variables
        byte edad = 20;
        short distancia = 1500;
        int poblacion = 100000;
        long estrellas = 9876543210L;
        float precio = 45.99f;
        double pi = 3.1415926535;
        char letra = 'A';
        boolean activo = true;
        String saludo = "Hola Mundo";

        // Operadores aritméticos
        int suma = edad + distancia;
        int resta = poblacion - 50000;
        int multiplicacion = edad * 2;
        int division = poblacion / 2;
        int modulo = poblacion % 3; // Resto de la división entre 3

        // Operadores de comparación
        boolean esIgual = edad == 20;
        boolean noEsIgual = poblacion != 200000;
        boolean mayor = distancia > 1000;
        boolean menorIgual = edad <= 21;

        // Operadores lógicos
        boolean andLogico = (edad > 18) && (activo == true);
        boolean orLogico = (precio < 50) || (distancia < 1000);
        boolean notLogico = !activo;

        // Incremento y decremento
        edad++; // edad = 21
        distancia--; // distancia = 1499

        // Imprimir resultados
        System.out.println(saludo);
        System.out.println("Edad: " + edad);
        System.out.println("Distancia: " + distancia);
        System.out.println("Población: " + poblacion);
        System.out.println("Estrellas: " + estrellas);
        System.out.println("Precio: $" + precio);
        System.out.println("Pi: " + pi);
        System.out.println("Letra: " + letra);
        System.out.println("Activo: " + activo);
        
        System.out.println("\nOperaciones aritméticas:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        System.out.println("\nOperaciones de comparación:");
        System.out.println("¿Edad == 20? " + esIgual);
        System.out.println("¿Población != 200000? " + noEsIgual);
        System.out.println("¿Distancia > 1000? " + mayor);
        System.out.println("¿Edad <= 21? " + menorIgual);

        System.out.println("\nOperaciones lógicas:");
        System.out.println("AND lógico: " + andLogico);
        System.out.println("OR lógico: " + orLogico);
        System.out.println("NOT lógico: " + notLogico);
    }
}
