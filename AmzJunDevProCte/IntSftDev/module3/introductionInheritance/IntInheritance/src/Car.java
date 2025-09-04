public class Car extends Vehicle{
    int seatPosition;

    public void adjustSeat(int adjusment){
        if(adjusment > 0)
        {
            System.out.println("Moving seat forware");
        }
        else if(adjusment < 0)
        {
            System.out.println("Moving seat backware");
        }
        else
        {
            System.out.println("Seat position not change");
        }
    }
}