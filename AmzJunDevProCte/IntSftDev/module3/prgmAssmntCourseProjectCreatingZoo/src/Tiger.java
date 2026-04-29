public class Tiger extends Animal implements Walk
{   
    private int numberOfStripes;
    private int speed;
    private int soundLevelOfRoad;    
       
    public Tiger(String nameOfAnimal)
    {     
        super(nameOfAnimal);
    }

    public int setNumberOfStripes(int numberOfStripes)
    {
        this.numberOfStripes = numberOfStripes;
        return numberOfStripes;
    }

    public int getNumberOfStripes()
    {
        return numberOfStripes;
    }

    public int setSpeed(int speed)
    {
        this.speed = speed;
        return speed;
    }

    public int getSpeed()
    {
        return speed;
    }
    public int setSoundLevelOfRoad(int soundLevelOfRoad)
    {
        this.soundLevelOfRoad = soundLevelOfRoad;
        return soundLevelOfRoad;
    }
    public int getSoundLevelOfRoad()
    {
        return soundLevelOfRoad;
    }

    @Override
    public void eatingFood() {
        // TODO Auto-generated method stub
        //super.eatingFood();
        System.out.println(super.getNameOfAnimal()+": I have eaten Meat");
    }

    @Override
    public void eatingCompleted() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'eatingCompleted'");
        System.out.println(super.getNameOfAnimal()+": Eating Completed");
    }

    @Override
    public void walking() {
        // TODO Auto-generated method stub
        //Walk.super.walking();
        System.out.println(super.getNameOfAnimal()+": I am walking at the speed: " + this.speed + " mph");
    }  
    
}