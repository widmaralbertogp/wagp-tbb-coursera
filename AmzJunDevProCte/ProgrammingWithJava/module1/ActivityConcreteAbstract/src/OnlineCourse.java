class OnlineCourse extends Course {

    //TODO 15: declare instance variables
    // Hint: weeks (int), videoLessons (int)
    private int weeks;
    private int videoLessons;


    //TODO 16: create a constructor
    // Hint: parameters (Subject subject, String instructor, int fee, int weeks, int videoLessons)
    // - Call the superclass constructor to initialize subject, instructor, and fee
    // - Initialize weeks and videoLessons
    public OnlineCourse(Subject subject, String instructor, int fee, int weeks, int videoLessons) {
        super(subject, instructor, fee);
        this.weeks = weeks;
        this.videoLessons = videoLessons;        
    }
}