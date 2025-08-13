public class PalindromeChecker{
    public static boolean isPalindrome(String text) {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }
}
/* Usage
String inputText = "madam";
boolean isPalindrome = PalindromeChecker.isPalindrome(inputText);
System.out.println("Is palindrome? " + isPalindrome);
*/
