import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        /** TODO 1: extend the class Animal to create a new
         *          land based animal named "Tiger" which extends
         *          Animal.
         *          Extra properties of class "Tiger" are:
         *          1. number of stripes
         *          2. speed
         *          3. sound level of roar
         *
         **/
        Tiger tigerObject = new Tiger("Tiger");

        /** TODO 2: extend the class Animal to create a new
         *          water based animal named "Dolphin" which
         *          extends Animal
         *          Extra properties of class "Dolphin" include:
         *          1. color of dolphin
         *          2. swimming speed
         *
         **/
        Dolphin dolphinObject = new Dolphin("Dolphin");
        Penguin penguinObject = new Penguin("Penguin");

        /** TODO 3: implemement the "Eat" interface in the
         *          "Tiger" class created in the TODO 1
         *          and also in the
         *          "Dolphin" class created in TODO 2.
         **/



        /** TODO 5: implement the "Walk" interface in
         *          "Tiger" class created in the TODO 1
         *          and in the  implementation of the
         *          "walking" method of the interface
         *          display -
         *          " I am walking at the speed "
         *          and join the value of the variable "speed"
         *
         **/

        /** TODO 6: create a new interface named "Swim"
         *          and declaring a method inside it
         *          named "swimming" with the return type
         *          "void"
         **/

        /** TODO 7: implement the "Swim" interface
         *          in the "Dolphin" class and the
         *          "swimming" method in its implementation
         *          should display the swimming speed as
         *          "Dolphin: I am swimming at the speed ...."
         *          where .... is the value of the variable
         *          "swimmingSpeed"
         **/


        /** TODO 8: create a menu system to work with the Animal selected
         *          use the switch provided below
         **/
        do {
            switch (animalChoiceMenu(keyboard)) 
            {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : ");
                        // get menu choice
                        menuChoice = animalDetailsManipulationMenu(keyboard, tigerObject);
                        switch (menuChoice) 
                        {
                            case 1:                                
                                System.out.print("Name of the tiger: ");
                                tigerObject.setNameOfAnimal(keyboard.next());
                                System.out.print("Enter speed: ");
                                tigerObject.setSpeed(keyboard.nextInt());
                                System.out.print("Number of Stripes: ");
                                tigerObject.setNumberOfStripes(keyboard.nextInt());
                                System.out.print("Age of the Tiger: ");
                                tigerObject.setAge(keyboard.nextInt());
                                System.out.print("Height of the Tiger: ");                                
                                tigerObject.setHeight(keyboard.nextInt());
                                System.out.print("Weight of the Tiger: ");                                
                                tigerObject.setWeight(keyboard.nextInt());
                                System.out.print("Sound level of the Road of the Tiger: ");
                                tigerObject.setSoundLevelOfRoad(keyboard.nextInt());
                                break;
                            case 2:   
                                System.out.println("Name of the tiger: " + tigerObject.getNameOfAnimal());
                                System.out.println("speed: " + tigerObject.getSpeed());
                                System.out.println("Number of Stripes: " + tigerObject.getNumberOfStripes());
                                System.out.println("Age of the Tiger: " + tigerObject.getAge());
                                System.out.println("Height of the Tiger: " + tigerObject.getHeight());
                                System.out.println("Weight of the Tiger: " + tigerObject.getWeight());
                                System.out.println("Sound level of the Road of the Tiger: " + tigerObject.getSoundLevelOfRoad());                                
                                break;
                            case 3: 
                                tigerObject.walking();                       
                                break;
                            case 4:
                                tigerObject.eatingFood();
                                tigerObject.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.print("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : ");
                        // get menu choice                        
                        menuChoice = animalDetailsManipulationMenu(keyboard, dolphinObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.print("Name of the Dolphin: ");
                                dolphinObject.setNameOfAnimal(keyboard.next());
                                System.out.print("Enter speed: ");
                                dolphinObject.setSwimmingSpeed(keyboard.nextInt());
                                System.out.print("Color of the Dolphin : ");
                                dolphinObject.setDolphinColor(keyboard.next());
                                System.out.print("Age of the Dolphin: ");
                                dolphinObject.setAge(keyboard.nextInt());
                                System.out.print("Height of the Dolphin: ");
                                dolphinObject.setHeight(keyboard.nextInt());                                
                                System.out.print("Weight of the Dolphin: ");
                                dolphinObject.setWeight(keyboard.nextInt());                                
                                break;
                            case 2:
                                System.out.println("Name of the Dolphin is: " + dolphinObject.getNameOfAnimal());
                                System.out.println("Swimming speed is : " + dolphinObject.getSwimmingSpeed());
                                System.out.println("The Color of the Dolphin is : " + dolphinObject.getDolphinColor());
                                System.out.println("The Age of the Dolphin is : " + dolphinObject.getAge());
                                System.out.println("The Height of the Dolphin is : " + dolphinObject.getHeight());
                                System.out.println("The Weight of the Dolphin is : " + dolphinObject.getWeight());
                                break;
                            case 3:
                                dolphinObject.swimming();
                                break;
                            case 4:
                                dolphinObject.eatingFood();
                                dolphinObject.eatingCompleted();
                                break;                                
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.print("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;

                case 3:
                    do {
                        System.out.println("The animal which is chosen is : ");
                        // get menu choice                        
                        menuChoice = animalDetailsManipulationMenu(keyboard, penguinObject);
                        switch (menuChoice) {
                            case 1:
                                System.out.print("Name of the Penguin: ");
                                penguinObject.setNameOfAnimal(keyboard.next());
                                System.out.print("Enter speed: ");
                                penguinObject.setSwimmingSpeed(keyboard.nextInt());                                
                                System.out.print("Age of the Penguin: ");
                                penguinObject.setAge(keyboard.nextInt());
                                System.out.print("Height of the Penguin: ");
                                penguinObject.setHeight(keyboard.nextInt());                                
                                System.out.print("Weight of the Penguin: ");
                                penguinObject.setWeight(keyboard.nextInt());                                
                                break;
                            case 2:
                                System.out.println("Name of the Penguin is: " + penguinObject.getNameOfAnimal());
                                System.out.println("Swimming speed is : " + penguinObject.getSwimmingSpeed());                                
                                System.out.println("The Age of the Penguin is : " + penguinObject.getAge());
                                System.out.println("The Height of the Penguin is : " + penguinObject.getHeight());
                                System.out.println("The Weight of the Penguin is : " + penguinObject.getWeight());
                                break;
                            case 3:
                                penguinObject.swimming();
                                penguinObject.walking();
                                break;
                            case 4:
                                penguinObject.eatingFood();
                                penguinObject.eatingCompleted();
                                break;                                
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.print("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.print("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);
        
        if(continueOuterLoop == '2')
        {
            System.out.println("Finished Program.");
            keyboard.close();
        }
        else
            System.out.println("Error [1] or [2] was waiting");
        /** TODO 9: create a class "Penguin" from the "Animal" class **/

        /** TODO 10: integrate the choice to pick a "penguin" in the menu system **/

    }

    private static int animalChoiceMenu(Scanner keyboard) 
    {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.print("Enter choice of animal:");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) 
    {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.print("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }
}