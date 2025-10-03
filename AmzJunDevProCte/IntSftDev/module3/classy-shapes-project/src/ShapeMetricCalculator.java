public class ShapeMetricCalculator {
    //Method to calculate  the area of a Rectangle object
    public static double calculateRectangleArea(Rectangle rectangle)
    {
        return rectangle.length * rectangle.width;
    }
    //Method to calculate  the area of a circle object
    public static double calculateCircleArea(Circle circle)
    {
        //write your logic for calculating the area of a circle
        double area;
        area = 3.14 * circle.radius;
        // return the area of the circle
        return area;
    }

}
