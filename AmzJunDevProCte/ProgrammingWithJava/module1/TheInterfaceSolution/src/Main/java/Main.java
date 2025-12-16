package Main.java;
public class Main {
    public static void main(String[] args) {
        AquaticAnimal aquaticAnimal = new AquaticAnimal();
        Amphibian amphibian = new Amphibian();
        TerrestrialAnimal terrestrialAnimal = new TerrestrialAnimal();  

        
        terrestrialAnimal.move();
        aquaticAnimal.move();
        amphibian.move();
        
    }
}