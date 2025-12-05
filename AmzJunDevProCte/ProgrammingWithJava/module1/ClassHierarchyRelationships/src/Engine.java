// =====================
// ENGINE CLASS (HAS-A)
// =====================
public class Engine {
    private String engineType;
    private double capacity; 

    public Engine(String type, double capacity) {
        this.engineType = type;
        this.capacity = capacity;
    }

    public String getType() {
        return engineType;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return engineType + " " + capacity + "L";
    }
}