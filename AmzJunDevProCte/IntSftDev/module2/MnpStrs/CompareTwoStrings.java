public class Main {
    public static void main(String[] args) {

        /*
         *
         *  Tip: Such code is used when comparing names so that it does not matter what case the user enters in
         *
         */
        String testString1 = "This is java";
        String upperCaseTestString1 = testString1.toUpperCase();

        //this will not execute
        if( testString1.equals(upperCaseTestString1) ) {
            System.out.println("Value of testString1 is equal to is uppercase version");
        }

        String testString2 = "THIS IS JAVA";
        String upperCaseTestString2 = testString2.toUpperCase();

        //this will execute
        if( testString2.equals(upperCaseTestString2) ) {
            System.out.println("Value of testString2 is equal to is uppercase version");
        }
    }
}
