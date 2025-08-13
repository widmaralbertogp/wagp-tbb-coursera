public class Main {
	public static void main(String[] args) {
    	String testString = "This is a test";
 
    	boolean result1 = testString.startsWith("test"); // false
    	boolean result2 = testString.startsWith("This"); // true
 
        System.out.println("testString.startsWith(\"test\") : " + testString.startsWith("test"));
        System.out.println("testString.startsWith(\"This\") : " + testString.startsWith("This"));
 
	}
}
