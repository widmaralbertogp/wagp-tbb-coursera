public class StringInterningDemo {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello").intern();
        String str4 = new String("hello").intern();

        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
        System.out.println("str3 == str4? " + (str3 == str4));
    }
}
