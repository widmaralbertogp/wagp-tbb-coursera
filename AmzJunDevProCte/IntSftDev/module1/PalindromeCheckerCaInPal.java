public class PalindromeChecker {
    public static boolean isPalindrome(String text) {
        String lowerCaseText = text.toLowerCase();
        String reversedText = new StringBuilder(lowerCaseText).reverse().toString();
        return lowerCaseText.equals(reversedText);
    }
}

// Usage
String inputText = "Madam";
boolean isPalindrome = PalindromeChecker.isPalindrome(inputText);
System.out.println("Is palindrome? " + isPalindrome);
