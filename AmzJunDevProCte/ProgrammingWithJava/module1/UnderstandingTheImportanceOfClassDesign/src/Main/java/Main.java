public class Main {
    public static void main(String[] args) {

        // Crear dirección
        Address addr = new Address("742 Evergreen St", "Springfield", "Illinois", "USA", "88001");

        // Crear nombre
        NameOfStudent name = new NameOfStudent("John", "H.", "Doe");

        // Crear materia
        Subject subject = new Subject("MAT101", "Calculus 1", 4);

        // Crear estudiante
        Student student = new Student(1001, name, addr, subject, 92.5);

        // Mostrar información del estudiante
        System.out.println(student.getStudentInfo());

        // EJEMPLO DE ABSTRACCIÓN - BOTONES
        GenericButton textButton = new TextButton("Save");
        GenericButton iconButton = new IconButton("settings.png");

        textButton.onClick();
        iconButton.onClick();
    }
}
