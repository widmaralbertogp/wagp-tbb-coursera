package Main.java;
public class Student extends Person implements StudentInterface {    
    private String subject;

        public Student(String name, String  subject) {        
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Subject: " + this.subject);
    }

    @Override
    public void computeGrade() {
        // Implementation for computing grade
        System.out.println(this.name + "'s grade computed.");
    }

    @Override
    public void payFee() {
        // implementation for paying fee
        System.out.println("The Student :"+this.name + "'s fee paid.");
    }    
}