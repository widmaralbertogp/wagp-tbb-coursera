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
        
    }

    @Override
    public void grindBeans()
    {
        //super.grindBeans(); 
        System.out.println("--------------------------------------------------");
        System.out.println("Grinding coffee beans coarsely for a latte (medium gring).");
    }
    
    @Override
    public void brewCoffee()
    {
        // Todo 12a: simulate brewingcoffe for a latte
        System.out.println("Brewing coffe for a latte");
        // Todo 12b: condition to check if syrupFlavor is selected
        if (!syrupFlavor.equals("no")) 
        {
            //Todo 12c: simulate adding the syrup
            System.out.println("Adding " + syrupFlavor + " syrup to the cup...");
        }
        // Todo 12d: simulate steaming milk
        System.out.println("Steaming skim milk...");
        // Todo 12e: simalte combining coffee and steamed milk
        System.out.println("Combining coffee and steamed milk...");
        // Todo 12f: simulate adding a lare of foram o top
        System.out.println("Adding a layer of foam on top...");        
   //     super.brewCoffee(); 
   //     System.out.println("Preparando el espresso a alta presión...");
        System.out.println("--------------------------------------------------");
    }

    @Override
    public void printInfo()
    {
        super.printInfo();         
        System.out.println("Your Latte has "+  milkType + " and " + syrupFlavor + "flavor");
        System.out.println("Your total bill is " + price + "$. " );
    }
}