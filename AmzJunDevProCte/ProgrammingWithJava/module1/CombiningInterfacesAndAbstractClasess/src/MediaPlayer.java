public interface MediaPlayer {
    void play();
    void pause();
    default void forward()
    {
        System.out.println("Skip 10 sec forward");
    }
    default void backward()
    {
        System.out.println("Skip 10 sec backward");
    }
}