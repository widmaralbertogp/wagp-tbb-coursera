import java.util.Scanner;

public class DietaryServicesAccess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for role
        System.out.println("Welcome to the Dietary Services Program.");
        System.out.println("Please enter your role (Employee, Enrolled Member, Subscriber, Non-Subscriber):");
        String role = scanner.nextLine().trim().toLowerCase(); // Normalize input

        // Determine access based on role
        switch (role) {
            case "employee":
                System.out.println("Access granted: You are authorized to access 'Dietary Services'.");
                break;
            case "enrolled member":
                System.out.println("Access granted: You are authorized to access 'Dietary Services' and one-on-one interaction with a dietician.");
                break;
            case "subscriber":
                System.out.println("Access granted: You have partial access to 'Dietary Services'.");
                break;
            case "non-subscriber":
                System.out.println("Access denied: You need to enroll or subscribe to access 'Dietary Services'.");
                break;
            default:
                System.out.println("Invalid role entered. Please enter a valid role.");
        }

        scanner.close();
    }
}