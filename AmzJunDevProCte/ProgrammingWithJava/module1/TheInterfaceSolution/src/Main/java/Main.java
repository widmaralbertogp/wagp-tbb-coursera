package Main.java;
public class Main {
    public static void main(String[] args) {
        AquaticAnimal aquaticAnimal = new AquaticAnimal();
        Amphibian amphibian = new Amphibian();
        TerrestrialAnimal terrestrialAnimal = new TerrestrialAnimal();  

        Student student = new Student("John",  "Mathematics");
        TeachingAssistant teachingAssistant = new TeachingAssistant("Sarah", "Physics");

        System.out.println("\nExample 1 - Animal Movements: on the Interface Solution Video");
        terrestrialAnimal.move();
        aquaticAnimal.move();
        amphibian.move();        
        System.out.println("\nExample 2 - Student and Teaching Assistant Actions: on the Interface Solution Video");
        student.computeGrade();
        student.payFee();  
        System.out.println("Computing salary and tax for Teaching Assistant:"+  teachingAssistant.computeSalary() + " and " + teachingAssistant.computeTax());        
        
    }
}