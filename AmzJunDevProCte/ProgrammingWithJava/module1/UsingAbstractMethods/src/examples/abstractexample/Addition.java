package examples.abstractexample;

public class Addition extends Adder {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    // Sobrecarga adicional
    public double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
}