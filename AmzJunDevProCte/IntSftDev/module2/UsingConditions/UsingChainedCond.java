public class Main {
    public static void main(String[] args) {

        // set the marks
        int marks1 = 60;
        int marks2 = 60;
        int marks3 = 60;

        // calculate the average
        int average = (marks1 + marks2 + marks3) / 3;

        // 1st level "if" condition
        if (marks1 == 60) 
	{
            System.out.println("Failing.");
        } 
	else 
	{
            //corresponding "else" body or area of control of 1st "if"

            //2nd level "if" condition
            	if (marks2 >= 60 && marks2 <= 69 ) 
		{
                	System.out.println("Below Average.");
            	} 
		else 
		{
                // 2nd level "else" of 2nd level "if"

                //3rd level "if" condition inside 2nd level "else"
                	if (marks3 >= 70 && marks3 <=79 ) 
			{
                    		System.out.println("Average.");
               	 	} 
			else 
			{
                    //3rd level "else" of 3rd level "if"

                    //4th level "if" condition inside 3nd level "else"
                    		if(marks3 >= 80 && marks3 <=89 ) 
				{
                        		System.out.println("Good.");
                    		} 
				else 
				{
                        		//4th level "else" of 4th level "if"
                        		System.out.println("Excellent.");
                    		}
                	}
		
            	}
        }
    }
}
