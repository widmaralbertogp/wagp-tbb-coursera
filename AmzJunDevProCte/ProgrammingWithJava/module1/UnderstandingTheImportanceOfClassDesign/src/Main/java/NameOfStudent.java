public class NameOfStudent {
    private String firstName;
    private String middleName;
    private String lastName;

    public NameOfStudent(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + middleName + " " + lastName;
    }
}
