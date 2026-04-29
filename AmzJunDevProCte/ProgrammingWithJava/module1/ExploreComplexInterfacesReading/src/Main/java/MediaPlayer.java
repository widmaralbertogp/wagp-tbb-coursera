package Main.java;
public class MediaPlayer implements MediaController  {
    public void start() {
        System.out.println("Player has started");
    }

    public void pause() {
        System.out.println("player paused");
    }

    public void stop() {
        System.out.println("player stopped");
    }

    public void increase(int value) {
        System.out.println("volume level increased to "+value+"");
    }

    public void decrease(int value) {
        System.out.println("volume level decreased to "+value+"");
    }

}
