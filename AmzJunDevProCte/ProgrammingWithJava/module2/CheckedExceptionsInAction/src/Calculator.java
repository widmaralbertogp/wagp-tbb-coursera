import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Calculator
{
    int firstNumber;
    int secondNumber;

    int add()
    {
        return firstNumber + secondNumber;
    }
    void readNumbersFromFile() // con >>> throws FileNotFoundException
    {
        try (Scanner fileScanner = new Scanner(new File("/var/www/coursera/AmzJunDevProCte/ProgrammingWithJava/module2/CheckedExceptionsInAction/src/numbers.txt")))
        {
            // assign to instance fields (avoid shadowing) and ensure scanner is closed
            firstNumber = fileScanner.nextInt();
            secondNumber = fileScanner.nextInt();
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println(fileNotFoundException.getMessage());
        }
    }
    
}