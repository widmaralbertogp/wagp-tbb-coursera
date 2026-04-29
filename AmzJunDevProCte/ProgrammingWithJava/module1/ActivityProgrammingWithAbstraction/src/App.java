import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Calculating Area of Rectangle: ");
        System.out.print("Enter Width:");
        float width = keyBoard.nextFloat();
        System.out.print("Enter height: ");
        float height = keyBoard.nextFloat();
        
        
        Rectangle rect = new Rectangle(width, height);
        rect.calculateArea();
        rect.draw();
        
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Calculating perimeter of rectangle: ");
        System.out.println("Perimeter: "+rect.calculatePerimeter());



        System.out.println("Calculating Area of Circle: ");
        System.out.print("Enter radius:");
        float radius = keyBoard.nextFloat();

        Circle myCircle = new Circle(radius);
        myCircle.calculateArea();
        myCircle.draw();
        
        System.out.println("Area: " + myCircle.calculateArea());
        System.out.println("Calculating perimeter of Circle: ");
        System.out.println("Perimeter: "+ myCircle.calculatePerimeter());


        keyBoard.close();
    }
}