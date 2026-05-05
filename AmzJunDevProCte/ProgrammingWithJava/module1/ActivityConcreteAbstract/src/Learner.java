//TODO 12: make Learner class implement Assessments interface
public class Learner implements Assessments {
    
    //TODO 1: declare instance variables
    String name;
    Course course;
    double gradeScore; 


    // Hint: name (String), course (Course), gradeScore (double)

    //TODO 2: create a constructor to initialize instance variables

    public Learner(String name, Course course) 
    {            
            this.name = name;                
            this.course = course;               
    }   
        

    public String toString() 
    {
        return "Name: " + this.name + " " + "Course: " + this.course.subject.title;
    }

    //TODO 13: override assignmentScore() method
    // Hint: set the assignment marks in the associated Course object
    

    @Override
    public void assignmentScore(int marks) {
        this.course.setAssignmentScore(marks);
    }

    //TODO 14: override quizScore() method
    // Hint: set the quiz marks in the associated Course object
    @Override
    public void quizScore(int marks) {
        this.course.setQuizScore(marks);
    }

    public double calculateGrade() {
        int maxAssignmentMarks, maxQuizMarks;
        //TODO 17: calculate gradeScore as per the instructions
        // - For online courses: assignment max = 30, quiz max = 10        
        // - For classroom courses: assignment max = 100, quiz max = 30            
        // - Compute assignmentGrade and quizGrade out of 10
        // - gradeScore = average of assignmentGrade and quizGrade        
        if (this.course instanceof OnlineCourse) 
        {
            maxAssignmentMarks = 30;
            maxQuizMarks = 10;
        } 
        else 
        {
            maxAssignmentMarks = 100;
            maxQuizMarks = 30;
        }   
        double assignmentGrade = ((double)this.course.getAssignmentMarks() / maxAssignmentMarks) * 10;  
        double quizGrade = (this.course.getQuizMarks() / maxQuizMarks) * 10;
        this.gradeScore = (assignmentGrade + quizGrade) / 2;        
        return this.gradeScore;
    }
}