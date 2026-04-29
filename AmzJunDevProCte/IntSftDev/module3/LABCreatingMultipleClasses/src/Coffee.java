public class Coffee
{
    // Attributes to store information about the coffee
    String name;                // for example, "Espresso", "Latte", "Mocha"
    String roast;               // for example, "light", "medium", "dark"
    int caffeineLevelInMg;      // calculated based on the roast
    double price;               // in dollars, for example, 2.50
    public Coffee(String name, String roast, double price)
    {
        this.name = name;
        this.roast = roast;        
        this.price = price;
        // The constructor calls the method to set the caffeine level based on the roast
        setCaffeineLevel();
    }
    public void setCaffeineLevel() 
    {
        if (roast.equals("light"))
        {
            caffeineLevelInMg = 50;
        }
        else if (roast.equals("medium"))
        {
            caffeineLevelInMg = 100;
        }
        else if (roast.equals("dark"))
        {
            caffeineLevelInMg = 150;
        }
        else
        {
            caffeineLevelInMg = 0;
        }
    }
    public void grindBeans()
    {
        System.out.println("--------------------------------------------------");
        System.out.println("Grinding beans for " + name + "...");
    }
    public void brewCoffee()
    {
        System.out.println("Brewing your favorite " + name + "...");
        System.out.println("--------------------------------------------------");
    }
    public void printInfo()
    {
        System.out.println("You ordered a " + name + " with a " + roast + " roast.");
        System.out.println("The caffeine level in your coffee is " + caffeineLevelInMg + " mg.");
    }
}