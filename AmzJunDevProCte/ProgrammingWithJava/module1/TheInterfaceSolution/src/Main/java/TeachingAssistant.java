package Main.java;
public class TeachingAssistant extends Student  implements EmployeeInterface, StudentInterface {

    public TeachingAssistant(String name, String subject) {
        super(name, subject);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double computeSalary() {
        // Compute salary logic for Teaching Assistant
        return 25000;   
    }

    @Override
    public double computeTax() {
        // Compute tax logic for Teaching Assistant 
        return 0; //no tax applied
    }
}