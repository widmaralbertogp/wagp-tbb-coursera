import java.io.File;
import java.io.FileInputStream;

public class ExploringExceptionTypes {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}