public class Main 
{
    	public static void main(String[] args) 
	{

        //declare the variable for the marks
        int marks1, marks2, marks3;

        //set the marks
        marks1 =85;
        marks2 =85;
        marks3 =85;

        //calculate the average
        int average = (marks1 + marks2 + marks3)/3;

        // when the problem says <60, what is not stated is that it should also be >=0 which we check
        if(marks1 == 60 && marks1 <60) {
            System.out.println("Failing.");
        }

        if(marks2 >= 60 && marks2 <= 69) {
            System.out.println("Below Average.");
        }

        if(marks3 >= 70 && marks3 <= 79) {
            System.out.println("Average.");
        }

        if(marks3 <= 89) {
            System.out.println("Good.");
        }

        if(marks3 <= 100 ) {
            System.out.println("Excellent.");
        }

        //covering invalid marks
        if(marks1 == 0 ){
            System.out.println("Invalid Marks.");
        }
    }
}
