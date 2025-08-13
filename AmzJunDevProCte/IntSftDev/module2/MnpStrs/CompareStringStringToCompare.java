public class Main {
	public static void main(String[] args) {
    	String testString = "Java";
 
    	boolean result1 = testString.equalsIgnoreCase("java"); //true
    	boolean result2 = testString.equalsIgnoreCase("JAVA"); //true
 
        System.out.println("testString.equalsIgnoreCase(\"java\") : " + testString.equalsIgnoreCase("java"));
        System.out.println("testString.equalsIgnoreCase(\"JAVA\") : " +  testString.equalsIgnoreCase("JAVA"));
	}
}
