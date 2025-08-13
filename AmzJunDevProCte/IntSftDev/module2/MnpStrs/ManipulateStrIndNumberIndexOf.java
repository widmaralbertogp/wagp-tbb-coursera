public class Main {
	public static void main(String[] args) {
    	String testString = "This is a test which is nice";
    	int indexOfSearch1= testString.indexOf("Java"); // returns -1
    	int indexOfSearch2 = testString.indexOf("is"); // returns 2
    	int indexOfSearch3 = testString.indexOf("est"); // returns 11
 
        System.out.println("testString.indexOf(\"Java\") : " + testString.indexOf("Java"));
        System.out.println("testString.indexOf(\"is\") : " + testString.indexOf("is"));
        System.out.println("testString.indexOf(\"est\") : " + testString.indexOf("est"));
 
	}
}
