public class Main {
	public static void main(String[] args) {
    	String testString = "This is a test";
    	String result1 = testString.substring(3);  //”s is a test”
    	String result2 = testString.substring(12); // “st”
 
        System.out.println("testString.substring(3) : " + testString.substring(3));
        System.out.println("testString.substring(12) : " + testString.substring(12));
 
	}
}
