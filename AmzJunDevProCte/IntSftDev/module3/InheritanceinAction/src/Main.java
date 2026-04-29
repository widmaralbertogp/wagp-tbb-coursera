public class Main {
    public static void main(String[] args)
    {        
        Car tesla = new Car("Tesla","Model S","Red");

        tesla.accelerate();
        tesla.getspeed();
        System.out.println(tesla.model + " is running at " + tesla.speed +" miles per hour");        
        tesla.brake();
        System.out.println(tesla.model + " is running at " + tesla.speed +" miles per hour");        
        tesla.adjustSeat(2);
    }    
}