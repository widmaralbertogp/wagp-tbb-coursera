public class Penguin extends Animal implements Walk, Swim
{
    public Penguin(String nameOfAnimal) 
    {
        super(nameOfAnimal);
    }

    private int swimmingSpeed;
    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }
    public void setSwimmingSpeed(int swimmingSpeed) 
    {
        this.swimmingSpeed = swimmingSpeed;     
    }

    

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return super.getAge();
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return super.getHeight();
    }

    @Override
    public String getNameOfAnimal() {
        // TODO Auto-generated method stub
        return super.getNameOfAnimal();
    }

    @Override
    public int getWeight() {
        // TODO Auto-generated method stub
        return super.getWeight();
    }

    @Override
    public void setAge(int age) {
        // TODO Auto-generated method stub
        super.setAge(age);
    }

    @Override
    public void setHeight(int height) {
        // TODO Auto-generated method stub
        super.setHeight(height);
    }

    @Override
    public void setNameOfAnimal(String nameOfAnimal) {
        // TODO Auto-generated method stub
        super.setNameOfAnimal(nameOfAnimal);
    }

    @Override
    public void setWeight(int weight) {
        // TODO Auto-generated method stub
        super.setWeight(weight);
    }

    @Override
    public void walking() {
        // TODO Auto-generated method stub
        //Walk.super.walking();
        System.out.println(super.getNameOfAnimal()+ " is Walking");
    }

    @Override
    public void swimming() {
        // TODO Auto-generated method stub
        //Swim.super.swimming();
        System.out.println(super.getNameOfAnimal()+": I am swimming");
    }

    @Override
    public void eatingFood() {
        // TODO Auto-generated method stub
        // super.eatingFood();
        System.out.println(super.getNameOfAnimal()+": I have eaten a fish");
    }

    @Override
    public void eatingCompleted() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'eatingCompleted'");
        System.out.println(super.getNameOfAnimal()+": Eating Completed");
    }
    
}
