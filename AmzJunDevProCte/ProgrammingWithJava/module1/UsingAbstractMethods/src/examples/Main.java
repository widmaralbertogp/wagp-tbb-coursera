package examples;

import examples.signature.AdditionBasic;
import examples.abstractexample.Addition;
import examples.polymorphism.*;

public class Main {

    public static void main(String[] args) {

        // ===========================
        // 1. METHOD SIGNATURE
        // ===========================
        System.out.println("=== METHOD SIGNATURE ===");
        AdditionBasic basic = new AdditionBasic();
        System.out.println("add(5, 10) = " + basic.add(5, 10));
        System.out.println("add(2.5, 3.1) = " + basic.add(2.5, 3.1));

        // ===========================
        // 2. ABSTRACT CLASS + OVERRIDE
        // ===========================
        System.out.println("\n=== ABSTRACT CLASS & OVERRIDE ===");
        Addition addition = new Addition();
        System.out.println("addition.add(7, 8) = " + addition.add(7, 8));
        System.out.println("addition.add(1.1, 2.2, 3.3) = " + addition.add(1.1, 2.2, 3.3));

        // ===========================
        // 3. POLIMORFISMO DINÁMICO
        // ===========================
        System.out.println("\n=== POLYMORPHISM ===");

        Shape shape;

        shape = new Rectangle(10, 20);
        shape.area();

        shape = new Circle(5);
        shape.area();
    }
}