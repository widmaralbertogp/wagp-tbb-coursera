package Main.java;
public class MusicPlayer implements Player {
    @Override
    public void play(String title) {
        System.out.println("Now Playing the track: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopped.");
    }

    public void shuffle() {
        System.out.println("Shuffling the playlist.");
    }
    public void adjustVolume(int level) {
        System.out.println("Volume adjusted to level: " + level);
    }    
}