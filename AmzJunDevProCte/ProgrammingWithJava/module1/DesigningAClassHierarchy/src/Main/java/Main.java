package Main.java;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(1, 1, 2005);
        Date date2 = new Date(10, 10, 1995);
        Date date3 = new Date(1, 4, 2024);

        Teacher teacher = new Teacher("Madhaven", date2, date3, "MSc", "Mathematics");
        teacher.setSalary();
        teacher.getDetails();
        Student student = new Student("Belinda", date1, teacher, "Electronic");
        student.getDetails();        
    }    
}