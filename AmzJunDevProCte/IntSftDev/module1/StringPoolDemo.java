public class StringPoolDemo {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = str2.intern();

        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
        System.out.println("str2 == str3? " + (str2 == str3));
    }
}
