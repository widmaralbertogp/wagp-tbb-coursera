public class KitchenHelper {
	// Write the method signature here
    public static void calculateIngredientQuantity(int servings, double originalQuantity)
    {
        // Your code here!
        double AdjQuan;
        // Calculate the adjusted ingredient quantity
        AdjQuan = servings * originalQuantity;
        // replace 0.0 with the adjusted quantity
        return AdjQuan;
    }
    
    public static void main(String[] args) {
        // Calling the method
       // Replace the arguments with your own values
        double newQuantity = calculateIngredientQuantity(4, 2.5);
        System.out.println("The adjusted ingredient quantity is: " + newQuantity);

    }
}