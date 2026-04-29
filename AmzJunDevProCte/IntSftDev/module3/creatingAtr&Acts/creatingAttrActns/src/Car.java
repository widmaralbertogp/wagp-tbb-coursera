import javax.swing.event.SwingPropertyChangeSupport;

public class Car 
{
    //Artibutes (member variables) define a Car's properties
    String make;
    String model;
    String color;

    //Method (action) to accelerate the Car
    public void accelerate()
    {
        System.out.println("The car is acelarating!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    //Method (action) to turn the Car
    public void turn()
    {
        System.out.println("The car is turning!");

    }

    //Method (action) to brake the Car
    public void brake()
    {
        System.out.println("The car is braking!");
    }
}
