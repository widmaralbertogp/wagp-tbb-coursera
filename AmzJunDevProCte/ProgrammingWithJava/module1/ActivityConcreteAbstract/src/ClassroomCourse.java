class ClassroomCourse extends Course {
    
    //TODO 6: declare instance variables
    // Hint: school (String), session (String)
    private String school;  
    private String session;

    //TODO 7: create a constructor
    // Hint: parameters (Subject subject, String instructor, int fee, String school, String session)
    // - Call the superclass constructor to initialize subject, instructor, and fee
    // - Initialize school and session
    public ClassroomCourse(Subject subject, String instructor, int fee, String school, String session) {
        super(subject, instructor, fee);
        this.school = school;
        this.session = session;
    }
}