public class Subject {
    private String subjectId;
    private String subjectName;
    private int credits;

    public Subject(String id, String name, int credits) {
        this.subjectId = id;
        this.subjectName = name;
        this.credits = credits;
    }

    public String getSubjectDetails() {
        return subjectId + " - " + subjectName + " (" + credits + " credits)";
    }
}
