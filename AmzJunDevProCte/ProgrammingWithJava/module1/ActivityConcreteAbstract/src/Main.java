import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);        

        //TODO 20: accept user input for learner's name
        // Hint: use Scanner.nextLine()
        
        System.out.print("Enter learner's name: ");
        String learnerName = in.nextLine(); 
                
        //TODO 18: display available courses and accept user choice
        // Hint: show a numbered list (e.g., 1 = Java, 2 = Java Online, etc.)
        //       and read choice using Scanner

        System.out.println("Available courses:");        
        System.out.println("1. Java Classroom Course");
        System.out.println("2. Java Online Course");
        System.out.print("Please select a course (1 or 2): ");        
        int courseChoice = in.nextInt();
        in.nextLine(); // Consume newline   
        //TODO 19: initialize object of chosen course
        // Hint: choose ClassroomCourse or OnlineCourse based on user input            
        Course selectedCourse;
        if (courseChoice == 1) {
            Subject javaSubject = new Subject("Java Programming", 3.0);
            selectedCourse = new ClassroomCourse(javaSubject, "Dr. Smith", 500, "ABC University", "Fall 2023");
        } 
        else 
        {
            Subject javaSubject = new Subject("Java Programming", 3.0);            
            selectedCourse = new OnlineCourse(javaSubject, "Dr. Smith", 300, 2, 2);            

        }

        //TODO 8: declare and initialize the object of ClassroomCourse class
        // Hint: provide subject, instructor, fee, school, and session

        Subject javaSubject = new Subject("Java Programming", 3.0);
        ClassroomCourse javaClassroomCourse = new ClassroomCourse(javaSubject, "Dr. Smith", 500, "ABC University", "Fall 2023");
             

        //TODO 9: declare and initialize the Learner object
        // Hint: pass learner's name and chosen Course object

        Learner learner = new Learner(learnerName, selectedCourse); 
        
        //TODO 21: call assignmentScore() and quizScore() methods
        // Hint: prompt the user for marks and call the respective methods

        System.out.print("Enter assignment score (0-10): ");                    
        int assignmentScore = in.nextInt();            
        learner.assignmentScore(assignmentScore); 
        System.out.print("Enter quiz score (0-10): ");
        int quizScore = in.nextInt();        
        learner.quizScore(quizScore);   


        //TODO 22: call calculateGrade() method and display result
        // Hint: if gradeScore >= 5, print "successfully passed"; otherwise, "successfully completed"
        double gradeScore = learner.calculateGrade();            
        System.out.println("Grade Score: " + gradeScore);        
        if (gradeScore >= 5) 
        {
            System.out.println("Congratulations " + learnerName + ", you have successfully passed the course!");
        } 
        else 
        {
            System.out.println("Congratulations " + learnerName + ", you have successfully completed the course!");                 
        }        
        in.close();                        
    }
}