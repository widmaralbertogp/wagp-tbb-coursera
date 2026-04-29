package examples.signature;

public class AdditionBasic {

    // Method signature: name + parameters
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    // Overloading: same name, different parameters
    public double add(double number1, double number2) {
        return number1 + number2;
    }
}
