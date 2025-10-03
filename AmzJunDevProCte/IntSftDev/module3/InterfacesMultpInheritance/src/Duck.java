class Duck extends Animal implements Flyable, Walkable{
    @Override
    public void flying()
    {
        System.out.println("I am Flying.");
    }
    public void quack()
    {
        System.out.println("I am quaking.... quack quack.");
    }

    @Override
    public void walking() {

    }
    //Code of duck class
}
