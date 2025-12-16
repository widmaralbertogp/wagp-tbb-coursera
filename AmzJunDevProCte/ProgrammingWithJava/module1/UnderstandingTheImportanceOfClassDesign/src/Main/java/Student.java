public class Student {

    private int studentId;
    private NameOfStudent name;
    private Address address;
    private Subject subject;
    private double percentage;

    public Student(int id, NameOfStudent name, Address address, Subject subject, double percentage) {
        this.studentId = id;
        this.name = name;
        this.address = address;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getStudentInfo() {
        return "STUDENT ID: " + studentId +
                "\nNAME: " + name.getFullName() +
                "\nADDRESS: " + address.getFullAddress() +
                "\nSUBJECT: " + subject.getSubjectDetails() +
                "\nAVERAGE GRADE: " + percentage + "%";
    }
}
