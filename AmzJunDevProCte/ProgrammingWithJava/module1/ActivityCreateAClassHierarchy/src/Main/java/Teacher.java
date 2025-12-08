package Main.java;

public class Teacher extends Employee {
    private String qualification;
    private  String subject;

    Teacher(String name, Date date1, Date date2, String qual, String subject)
    {
        this.name = name;
        this.dob = date1;
        this.dateOfAppointment = date2;
        this.subject = subject;
        this.qualification = qual;
    }

    @Override
    void setSalary() 
    {        
        this.salary = 95000;
    }

    @Override
    int getSalary() 
    {
        return this.salary;
    }

    @Override
    public void getDetails() 
    {
        System.out.println("Name of Teacher: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Date of Appointment: " + this.dateOfAppointment.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Qualifications: " + this.qualification);
        System.out.println("Salary: " + this.getSalary());
        System.out.println();
    }
}