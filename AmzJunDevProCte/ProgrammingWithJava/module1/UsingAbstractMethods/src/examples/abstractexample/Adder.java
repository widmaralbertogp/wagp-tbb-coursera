package examples.abstractexample;

public abstract class Adder {

    // Método abstracto (solo firma)
    public abstract int add(int num1, int num2);

    // Método normal
    public double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
}
