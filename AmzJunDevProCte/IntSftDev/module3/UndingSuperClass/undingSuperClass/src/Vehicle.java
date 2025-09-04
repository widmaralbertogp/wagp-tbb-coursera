public class Vehicle 
{
    String make;
    String model;
    String color;
    int speed;

    public Vehicle(String make, String model, String color)
    {
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;
        System.out.println("Vehicle created.");
    }

    public void accelerate() 
    {
        System.out.println("The vehicle is speeding up.");
        this.speed += 5;
    }

    public void brake() 
    {
        System.out.println("The vehicle is slowing down.");
        this.speed -= 5;
    }

    public void turn(String direction) 
    {
        System.out.println("Turning " + direction);        
    }
    
    public int getSpeed() 
    {
        return speed;
    }
}
