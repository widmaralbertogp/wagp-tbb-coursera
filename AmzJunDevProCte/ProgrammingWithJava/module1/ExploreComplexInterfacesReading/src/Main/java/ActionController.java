package Main.java;
public interface ActionController
{
    void start();
    void pause();    
    void stop();
    
    default void forward()
    {
        System.out.println("Skip forward by 10 sec");
    }

    default void backward()
    {
        System.out.println("Skip backward by 10 sec");
    }

}
