package Main.java;
public class AquaticAnimal extends Animal implements Movable {
    //Common properties of aquatic animals

    @Override
    public void move() {
        System.out.println("The Aquatic Animal swims");
    }
}