public class Car extends Vehicle 
{
    int seatPosition;

    public Car(String make, String model, String color)
    {
        super(make, model, color);
        this.seatPosition = 0;
        System.out.println("Car created");
    }

    public void adjustSeat(int adjustment)
    {
        this.seatPosition += adjustment;
        
        if (adjustment > 0 )
        {
            System.out.println("Moving seat forward...");
        }
        else if (adjustment < 0 )
        {
            System.out.println("Moving seat backward...");
        }
        else 
        {
            System.out.println("Seat position not changed.");
        } 
    }
}