public class UsingMultipleCatchBlocks {
    public static void main(String[] args) 
    {             
        try {      
            int[] numbers = new int[5];
            numbers[0] = 10 / 0;            
        } 
        catch (ArithmeticException exception)
        {  
            System.out.println("ArithmeticException: " + exception.getMessage());  
        } 
        catch (RuntimeException exception) 
        {  
             System.out.println("RuntimeException: " + exception.getMessage());            
        }                
    }    
}