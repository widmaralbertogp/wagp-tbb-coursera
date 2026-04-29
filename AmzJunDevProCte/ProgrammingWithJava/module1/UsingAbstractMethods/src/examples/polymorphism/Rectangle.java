package examples.polymorphism;

public class Rectangle extends Shape {

    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void area() {
        int areaOfRectangle = width * height;
        System.out.println("Area of rectangle: " + areaOfRectangle);
    }
}
