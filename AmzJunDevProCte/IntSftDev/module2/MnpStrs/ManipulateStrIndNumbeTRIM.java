public class Main {
	public static void main(String[] args) {
    	String testString = "  This is a test	";
    	String result1 = testString.trim(); // results in “This is a test”
 
    	System.out.println("testString : #" + testString + "#");
        System.out.println("testString.trim() : #" +  testString.trim() + "#");
 
	}
}
