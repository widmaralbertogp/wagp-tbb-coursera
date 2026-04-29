package Main.java;
public class Amphibian extends Animal implements Movable {
    @Override
    public void move() {
        System.out.println("The Amphibian jumps and swims");
    }
}