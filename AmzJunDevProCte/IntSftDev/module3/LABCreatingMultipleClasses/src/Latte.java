public class Latte extends Coffee
{
    String milkType; // [Whole milk","Skimmed milk","Oak milk","Almond milk"];
    String syrupFlavor; // ["Vanilla","Caramel","Hazelnut", "None"];

    public Latte(String name, String roast, double price, String milkType, String sysrupFlavoString)
    {
        super(name, roast, price);                
        this.milkType = "";
        this.syrupFlavor = "";
    }
    public void printLatteDetails()
    {
        System.out.println("Your Latte has "+  this.milkType + " and " + this.syrupFlavor + "flavor");        
        System.out.println("Your total bill is " + this.price);   
    }
}