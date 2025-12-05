abstract class Truck extends Vehicle {
    protected int loadCapacity; // Ej: Kg o toneladas

    public Truck(String registrationNumber, Engine engine, int loadCapacity) {
        super(registrationNumber, engine);
        this.loadCapacity = loadCapacity;
    }
}