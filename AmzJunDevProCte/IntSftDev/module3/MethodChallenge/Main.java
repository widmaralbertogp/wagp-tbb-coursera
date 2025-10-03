public class Main
{
    // write method signature here
    public static double calculateIngredientQuantity(int servings, double originalQuantity)
    {
        // Calculate the adjusted ingredient quantity                
        return servings * originalQuantity;
    }   
    
    public static void spiceUpDish(int spiceLevel)
    {
        if (spiceLevel == 1) 
        {
            System.out.println("Nivel 1");
        }
        else if (spiceLevel == 2) 
        {
            System.out.println("Nivel 2");
        }
        else if (spiceLevel == 3) 
        {
            System.out.println("Nivel 3");
        }
        else if (spiceLevel == 4)
        {
            System.out.println("Nivel 4");
        }
        else if (spiceLevel == 5)
        {
            System.out.println("Nivel 5");
        }
        else 
        {

        }  
    }

    public static void greetGuest(String name, String timeOfDay)
    {
        
        System.out.println("Good "+ timeOfDay + " Mr. " + name);
    }

    
    public static void main(String[] args)     
    {
        // Calling the method
        
        double newQuantity = calculateIngredientQuantity(4,2.5);
        spiceUpDish(3);
        greetGuest("Harry", "Afternoon");        
        System.out.println("The adjusted ingredient quantity is: " + newQuantity);
    }
}