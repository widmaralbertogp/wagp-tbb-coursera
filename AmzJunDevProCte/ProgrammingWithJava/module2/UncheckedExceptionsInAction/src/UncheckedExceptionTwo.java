public class UncheckedExceptionTwo {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length()); // This will throw NullPointerException
        
    }
}
