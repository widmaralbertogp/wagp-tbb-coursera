abstract class Motorcycle extends Vehicle {
    protected boolean hasFairing;

    public Motorcycle(String registrationNumber, Engine engine, boolean hasFairing) {
        super(registrationNumber, engine);
        this.hasFairing = hasFairing;
    }
}