public class Main {
    public static void main(String[] args)
    {
        //Create a rectangle object with specified length and width
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        //Create a Circle object with specified radius
        Circle circle = new Circle(3);

        // Calculate the area of the rectangle, and store the result in a variable
        double areOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);
        // Calculate the area of the Circle, and store the result in a variable
        double areOfCircle = ShapeMetricCalculator.calculateCircleArea(circle);
        // Print the result
        System.out.println("The area of the Rectangle is: "+ areOfRectangle);
        System.out.println("The area of the Circle is: "+ areOfCircle);


    }
}