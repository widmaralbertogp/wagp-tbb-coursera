package examples.polymorphism;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of Circle: " + areaOfCircle);
    }
}
