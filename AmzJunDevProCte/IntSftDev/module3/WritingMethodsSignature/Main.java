public class Main
{
    //Area of square = side * side
    static double sideOfSquare;

    //methods to set the side of the square
    public static void setSquareSide()
    {
        sideOfSquare = 5.2;
    }

    // Methods to calculat the area of the square
    public static double calculateAreaOfSquare()
    {
        return sideOfSquare * sideOfSquare;
    }
    
    // the main method
    public static void main(String[] args)
    {
        setSquareSide();
    
        // call the method to calculate the area of the square
        // and store the result given back by the method in a varible 
        double areaOfSquare = calculateAreaOfSquare();

        //Print the result, using the values frrom the variable
        System.out.println("Area of the square with side " + sideOfSquare + " is: " + areaOfSquare );
    }
}