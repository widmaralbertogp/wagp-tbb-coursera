// ======================================
// CONCRETE CLASS: SEDAN (IS-A: Car > Vehicle)
// ======================================
public class Sedan extends Car {    
    private int doors;

    public Sedan(String registrationNo, Engine engine,String make, String model, String color, int year,int doors)     
    {
        super(registrationNo, engine, make, model, color, year);
        this.doors = doors;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void startEngine() {
        System.out.println("Sedan " + make + " " + model + " (" + year + "), " +
                color + ", " + doors + " doors, engine " + engine +
                " has started. Registration: " + registrationNo);
    }
/*
    @Override
    String getColor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getColor'");
    }

    @Override
    String getModel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getModel'");
    }
         */ 
}