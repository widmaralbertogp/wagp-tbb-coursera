public class Main {
    public static void main(String[] args) 
    {
        Calculator calculator = new Calculator();
        calculator.readNumbersFromFile();
        int result = calculator.add();
        System.out.println("The sum is: " + result);
    }
}
