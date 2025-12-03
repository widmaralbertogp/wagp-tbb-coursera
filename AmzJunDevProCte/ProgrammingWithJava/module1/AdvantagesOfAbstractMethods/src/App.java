public class App {
    public static void main(String[] args) {
    // ==== Animal hierarchy ====
    Animal tiger = new Tiger();
    Animal fish = new Fish();
    Animal caballo0 = new Horse(); // caballo incluido

    System.out.println("=== Animal Examples ===");
    tiger.eat();
    tiger.sound();
    tiger.move();

    System.out.println();

    fish.eat();
    fish.sound();
    fish.move();

    System.out.println();

    caballo0.eat();
    caballo0.sound();
    caballo0.move();

    System.out.println();

    // ==== Button hierarchy ====
    System.out.println("=== Button Examples ===");

    Button simpleBtn = new SimpleButton();
    simpleBtn.setText("Click Me!");
    simpleBtn.onClick();

    System.out.println();

    Button toggleBtn = new ToggleButton();
    toggleBtn.setText("Power");
    toggleBtn.onClick(); // ON
    toggleBtn.onClick(); // OFF
    }
}