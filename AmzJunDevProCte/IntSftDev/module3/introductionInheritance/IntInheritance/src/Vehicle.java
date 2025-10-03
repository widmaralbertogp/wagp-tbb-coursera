public class Vehicle {
    String make;
    String model;
    String color;
    int speed;    

    public void accelerate()
    {
        System.out.println("The vehicle is accelerate up");   
        speed = 10;
    }
    public void brake()
    {
        System.out.println("The vehicle velocity is down");   
        speed = 0;
    }
    public void turn()
    {
        System.out.println("The vehicle is turn on");   
    }  
    public int getspeed()
    {
        return speed;
    }    
}