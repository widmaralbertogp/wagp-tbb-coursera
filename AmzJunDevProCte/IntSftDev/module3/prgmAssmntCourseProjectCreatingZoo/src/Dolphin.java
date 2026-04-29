public class Dolphin extends Animal implements Swim
{
  
    private String dolphinColor;
    private int swimmingSpeed;
    
     
    public Dolphin(String nameOfAnimal) 
    {
        super(nameOfAnimal);
    }

    public String getDolphinColor() {
        return dolphinColor;
    }
    public void setDolphinColor(String dolphinColor) {
        this.dolphinColor = dolphinColor;        
    }
    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(int swimmingSpeed) 
    {
        this.swimmingSpeed = swimmingSpeed;     
    }
  
  @Override
    public void eatingFood() 
    {
        // TODO Auto-generated method stub
        //super.eatingFood();        
        System.out.println(super.getNameOfAnimal()+": I am eating delicious Fish");
    }
    
    @Override
    public void eatingCompleted() 
    {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'eatingCompleted'");
        System.out.println(super.getNameOfAnimal()+": Eating Completed");
    }
  
    @Override
    public void swimming() 
    {
        // TODO Auto-generated method stub
        //Swim.super.swimming();
        System.out.println(super.getNameOfAnimal()+": I am swimming at the speed of " + this.swimmingSpeed + " nautical miles per hour");        
    }
}