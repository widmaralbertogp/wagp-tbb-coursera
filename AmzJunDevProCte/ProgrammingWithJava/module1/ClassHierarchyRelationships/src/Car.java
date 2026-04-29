// =============================
// ABSTRACT CAR CLASS (IS-A)
// =============================
abstract class Car extends Vehicle {
    protected String make;
    protected String model;
    protected String color;
    protected int year;  

    public Car(String regNo, Engine engine, String make, String model, String color, int year) {
        super(regNo, engine);
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }   
    /*
    abstract String getColor();
    abstract String getModel();
    public void getYear(int year) {
        this.year = year;
    }
    
    public String getDetails()
    {
        return "Car with "+ this.registrationNo + " model :" + this.model + " year of Mfg: " + this.year;
    }   
         */
}