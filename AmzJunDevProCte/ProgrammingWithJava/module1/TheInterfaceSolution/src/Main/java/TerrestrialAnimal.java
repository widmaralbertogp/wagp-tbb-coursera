package Main.java;
public class TerrestrialAnimal extends Animal implements Movable {
    //Common properties of terestrials Animals
    @Override
    public void move() {
        System.out.println("The Terrestrial Animal jumps, crawls, and runs");
    }
}