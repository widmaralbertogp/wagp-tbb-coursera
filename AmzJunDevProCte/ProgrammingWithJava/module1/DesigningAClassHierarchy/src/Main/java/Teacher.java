package Main.java;

public class Teacher extends Employee {
    String qualification;
    String subject;
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
    void getDetails() 
    {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + this.name);
        System.out.println("Date of Birth: " + this.dob.day + "-" + this.dob.month + "-" + this.dob.year);
        System.out.println("Date of Appointment: " + this.dateOfAppointment.day + "-" + this.dateOfAppointment.month + "-" + this.dateOfAppointment.year);
        System.out.println("Qualification: " + this.qualification);
        System.out.println("Subject: " + this.subject);
        System.out.println("Salary: " + this.salary);
        System.out.println();
    }

    
}
