public class Latte extends Coffee
{
    String milkType;
    String syrupFlavor;
    public Latte(String name, String roast, double price, String milkType, String syrupFlavor)
    {
        super(name, roast, price);
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }
    public void printLatteDetails()
    {
        System.out.println("Your Latte has "+  milkType + " and " + syrupFlavor + "flavor");
        System.out.println("Your total bill is " + price + "$. " );
    }
}