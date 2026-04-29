// =============================
// ABSTRACT VEHICLE (IS-A base)
// =============================
abstract class Vehicle {
    protected String registrationNo;
    protected Engine engine; // HAS-A relationship with Engine class
    
    public Vehicle(String regNo, Engine engine) {
        this.registrationNo = regNo;
        this.engine = engine;
    }
    public abstract void startEngine(); //abstract method   subclasses must implement this method
}