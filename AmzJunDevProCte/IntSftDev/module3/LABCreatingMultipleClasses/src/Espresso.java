public class Espresso extends Coffee
{
    int numberOfShots;

    public Espresso(String name, String roast, double  price, int numberOfShots)
    {
        super(name, roast, price);
        this.numberOfShots = 0;
    }
    
    public void printEspressoDetails()
    {
        System.out.println("You asked for "+  this.numberOfShots + " servings!");
        System.out.println("Every servings of " + this.name + " costs " + this.price);
        System.out.println("Your total bill is " + this.price * this.numberOfShots);
    }
    
}