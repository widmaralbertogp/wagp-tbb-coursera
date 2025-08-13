public class Main
{
    static String[] ingredients;
    static boolean sandwichReady;
    public static void gatherIngredients()
    {
        ingredients = new String[4];
        ingredients[0] = "bread";
        ingredients[1] = "chicken slices";
        ingredients[2] = "cheese slices";
        ingredients[3] = "lettuce";
        System.out.println("All ingredients arranged.");
    }
    public static void assembleSandwich()
    {
        if(ingredients.length == 4)
        {
            if(ingredients[0].equals("bread") && ingredients[1].equals("chicken slices") && ingredients[2].equals("cheese slices") && ingredients[3].equals("lettuce"))
            {
                System.out.println("Assembling the sandwich");
                sandwichReady = true;
            }
        }
        else
        {
            System.out.println("oops! missing required ingredients");
        }
    }
    public static void serverSandwich()
    {
        System.out.println("Serving the sandwich...");
    }
    public static void main(String[] args) 
    {
        gatherIngredients();
        assembleSandwich();
        serverSandwich();
    }
}