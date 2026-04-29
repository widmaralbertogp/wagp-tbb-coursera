public class Main {
    public static void main(String[] args) {

        String fullName = "Tim Berners Lee";
        String familyName = "Lee";

        if( fullName.contains(familyName) ) {
            System.out.println("The family name " + familyName + " exists in the name " + fullName);
        }
    }
}
