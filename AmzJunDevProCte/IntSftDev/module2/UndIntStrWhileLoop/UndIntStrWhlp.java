import java.util.Scanner;
public class Main 
{
    	public static void main(String []args) 
	{
        	Scanner keyboard = new Scanner(System.in);
		int totalTrash = 22;
		int trashToCarry = 5; 
		while(totalTrash > 0)
		{
			if(totalTrash < 5)
			{
				trashToCarry = totalTrash;
			}
			totalTrash = totalTrash- trashToCarry;
			System.out.println("Removed 5 item. Total remaining: " + totalTrash);
		}
	}
}

