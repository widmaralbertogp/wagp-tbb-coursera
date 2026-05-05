abstract class Course {
    // TODO 3: Include instance variables and create a constructor to initialize some of them
// Hint: Instance variables: subject (Subject), instructor (String), fee (int), assignmentMarks (int), quizMarks (int)
//       Constructor parameters: (Subject subject, String instructor, int fee) to initialize subject, instructor, and fee
    private Subject subject;
    private String instructor;
    private int fee;
    private int assignmentMarks;
    private int quizMarks;

    public Course(Subject subject, String instructor, int fee) 
    {        
        this.subject = subject;
        this.instructor = instructor;
        this.fee = fee;         
    }
    // Setter assignment
    public void setAssignmentScore(int marks) {
        this.assignmentMarks = marks;
    }

    // Setter quiz
    public void setQuizScore(int marks) {
        this.quizMarks = marks;
    }

    // Getter assignment
    public int getAssignmentMarks() {
        return assignmentMarks;
    }

    // Getter quiz
    public int getQuizMarks() {
        return quizMarks;
    }


}