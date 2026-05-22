public class MultipleCatchBlocksThree {
    public static void main(String[] args) {
        String s = "Hello";
        int x = 100;

        if(x < 100) {
            s = null;
        }

        try {
            System.out.println(s.length() / (s.length() - s.length()));
        } catch (ArithmeticException e) {
            System.out.println("/ by zero");
        } catch (NullPointerException e) {
            System.out.println("Cannot invoke String.length() because s is null");
        }
    }
}
