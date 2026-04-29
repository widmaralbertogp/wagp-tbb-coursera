public class Main {
    public static void main(String[] args) {
        int scoopsSold;

        System.out.println("Selling chocolate ice cream: 20 scoops");
        for(scoopsSold=0; scoopsSold<20; scoopsSold++)
        {
            System.out.println("Sold Scoop No: " + (scoopsSold + 1));
        }
        System.out.println("No more chocolate scoops left in box.");


	String stringToTravel = "TONI says ice cream PER scoop";
        // The variable to count the number of vowels
        int countVowels = 0;
        for(int indexPosition = 0; indexPosition<stringToTravel.length(); indexPosition++) {
            // this method charAt() returns the character at the index number given
            char ch = stringToTravel.charAt(indexPosition);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                countVowels++;
            }
        }
        System.out.println("The total number of vowels in the String is: " + countVowels);


        countVowels = 0;
        for(int indexPosition = 0; indexPosition<stringToTravel.length(); indexPosition++)
	{
            // this method charAt() returns the character at the index number given
            	char ch = stringToTravel.charAt(indexPosition);
            	if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
		{
                	countVowels++;
            	}
        }
        System.out.println("The total number of vowels in the String is: " + countVowels);


	stringToTravel = "TONI says ice cream PER scoop";
        countVowels = 0;
	stringToTravel = stringToTravel.toLowerCase();
        for(int indexPosition = 0; indexPosition<stringToTravel.length(); indexPosition++) 
	{
            // this method charAt() returns the character at the index number given
            	char ch = stringToTravel.charAt(indexPosition);
            	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
		{
                	countVowels++;
           	}
        }
        System.out.println("The total number of vowels in the String is: " + countVowels);

	//  Consonantes ======>>>>>

	stringToTravel = "TONI says ice cream PER scoop";
        countVowels = 0;
	stringToTravel = stringToTravel.toLowerCase();
        for(int indexPosition = 0; indexPosition<stringToTravel.length(); indexPosition++) 
	{
            // this method charAt() returns the character at the index number given
            	char ch = stringToTravel.charAt(indexPosition);
            	if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')) 
		{
                	countVowels++;
           	}
        }
	System.out.println("The total number of consonants in the String is: " + countVowels );

	// The string given
//        String stringToReverse = "TONI says ice cream PER scoop";
        String stringToReverse = "madam";
        // The string to contain the reversed string
        String reversed = "";
        for(int indexPosition = stringToReverse.length() - 1; indexPosition >= 0; indexPosition--) {
            char ch = stringToReverse.charAt(indexPosition);
            reversed = reversed + ch;
        }
        System.out.println("The reverse of " + stringToReverse + " is: " + reversed);


	if(stringToReverse.equals(reversed))
	{
		System.out.println(stringToReverse+" is a palindrome.");
	}
	else
	{
		System.out.println(stringToReverse+" is not a palindrome.");
	}
    }
}
