public class App {
    public static void main(String[] args) throws Exception 
    {
        //Create a red Colorado
        Car colorado = new Car();
        colorado.make = "Chevrolet";
        colorado.model = "Colorado";
        colorado.color = "Red";

        //creating a blue Mustang
        Car mustang = new Car();
        mustang.make = "Ford";
        mustang.model = "Mustang";
        mustang.color = "Blue";


        //Make the colorado accelerate
        colorado.accelerate();
        //Make the mustang turn
        mustang.turn();
        System.out.println(colorado);
        System.out.println(mustang);
    }
}
