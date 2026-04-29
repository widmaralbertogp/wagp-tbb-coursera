import javax.swing.event.SwingPropertyChangeSupport;

public class Espresso extends Coffee
{
    int numberOfShots;
    public Espresso(String name, String roast, double  price, int numberOfShots)
    {
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }
    public void printEspressoDetails()
    {
        
    }
    
    @Override
    public void grindBeans()
    {
        super.grindBeans(); 
        System.out.println("Grinding the espresso beans finely...");
    }
    
    @Override
    public void brewCoffee()
    {
        super.brewCoffee(); 
        System.out.println("Brewing the espresso under high pressure...");
        System.out.println("--------------------------------------------------");
    }

    @Override
    public void printInfo()
    {
        super.printInfo();         
        System.out.println("You asked for "+  numberOfShots + " servings!");
        System.out.println("Every servings of Espresso cost " + price + "$. Your total bill is " + (price * numberOfShots) + "$.");
    }

}