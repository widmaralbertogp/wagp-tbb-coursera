public class Main {
	public static void main(String[] args) {
    	String testString = "This is a test";
 
    	boolean result1 = testString.endsWith("test"); // true
    	boolean result2 = testString.endsWith("This"); // false
 
        System.out.println("testString.endsWith(\"test\") : " + testString.endsWith("test"));
        System.out.println("testString.endsWith(\"This\") : " + testString.endsWith("This"));
 
	}
}
