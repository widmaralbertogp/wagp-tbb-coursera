public class Car extends Vehicle{
    
    int seatPosition;

  
    // Parameterized constructor to initialize with specific values
    public Car(String make, String model, String color)
    {
        super(make, model, color);        
        this.seatPosition = 0;
        System.out.println("Car created.");
    }

    public void adjustSeat(int adjusment)
    {
        if(adjusment > 0)
        {
            System.out.println("Moving seat forware...");
        }
        else if(adjusment < 0)
        {
            System.out.println("Moving seat backware...");
        }
        else
        {
            System.out.println("Seat position not change...");
        } 
    }

}