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
        System.out.println("You asked for "+  numberOfShots + " servings!");
        System.out.println("Every servings of Espresso cost " + price + "$. Your total bill is " + (price * numberOfShots) + "$.");
    }
}