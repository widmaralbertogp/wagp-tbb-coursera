public class App
{
    public static void main(String[] args) 
    {
        
        SportsCar ferrari = new SportsCar( "Ferrari", "F8 Tributo", "red");
        ferrari.activateTurboBoost();
        System.out.println(ferrari.model + " is running at " + ferrari.getSpeed() + " miles per hour.");
    }
}