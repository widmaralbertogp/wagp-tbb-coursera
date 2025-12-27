public class Main {
    public static void main(String[] args) {        
        //TODO 15: instantiate Student class
        Student student = new Student("John", 20, "Math", 75);
        System.out.println("\nStudent Details:"    );
        student.getDetails();
        //TODO 16: call result() and fee() methods
        student.result();     
        student.fee(1000);
        
        Employee employee = new Employee("Alice", 30, 5000);
        //TODO 17: declare object of Employee class and initialize it            
        System.out.println("\nEmployee Details:"    );
        employee.getDetails();
        //TODO 18: call computeSalary() and computeTax() methods
        employee.computeSalary();
        employee.computeTax();
    }
}