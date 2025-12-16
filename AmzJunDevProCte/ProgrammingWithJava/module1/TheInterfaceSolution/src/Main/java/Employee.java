package Main.java;

public class Employee  extends Person implements EmployeeInterface {
    private int basicPay;

    public Employee(String name, int basic){  
        this.name = name;
        this.basicPay = basic;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("The employee is: " + this.name);
    }

    @Override
    public double computeSalary() 
    {
        // Implementation for computing salary
        double salary;
        salary = this.basicPay + (this.basicPay * 0.50); // Example calculation
        //salary computation logic
        return salary;        
    }

    @Override
    public double computeTax() 
    {
        // implementation for paying tax
        return this.basicPay * 0.10; // Example tax calculation
    }
}
