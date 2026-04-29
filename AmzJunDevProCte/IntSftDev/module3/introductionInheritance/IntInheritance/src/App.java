public class App {
    public static void main(String[] args) throws Exception {
        Car gt = new Car();

        gt.make = "Ford";
        gt.model = "GT";
        gt.color = "Red";

        //Send gt for repair
        //Call repair method from Garage Class
        
        gt.accelerate();        
        System.out.println(gt.model + " remaining of " + gt.getspeed() + " milles per hour.");
     
        //create a garage    
        Garage garage = new Garage();
        garage.repair(gt);
    }    
}