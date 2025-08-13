public class Main {
	public static void main(String[] args) {
    	String testString = "Java";
 
    	// non-zero is not equal and zero means equal
    	int result1 = testString.compareTo ("java"); // returns -32
    	int result2 = testString.compareTo("JAVA"); // returns 32
 
    	int result3 = testString.compareToIgnoreCase("java"); // returns 0
    	int result4 = testString.compareToIgnoreCase("JAVA"); // returns 0
 
 
    	System.out.println("------- Comparing with respect to case ----------");
        System.out.println("testString.compareTo (\"java\") : " + testString.compareTo ("java"));
        System.out.println("testString.compareTo(\"JAVA\") : " +  testString.compareTo("JAVA"));
 
    	System.out.println("------- Comparing irrespective of case ----------");
        System.out.println("testString.compareToIgnoreCase(\"java\") : " + testString.compareToIgnoreCase("java"));
        System.out.println("testString.compareToIgnoreCase(\"JAVA\") : " +  testString.compareToIgnoreCase("JAVA"));
 
	}
}
