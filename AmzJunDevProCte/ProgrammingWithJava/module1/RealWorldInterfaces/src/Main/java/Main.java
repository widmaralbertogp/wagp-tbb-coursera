package Main.java;

public class Main {
    public static void main(String[] args) {
        MusicPlayer myPlayer = new MusicPlayer();
        myPlayer.play("Imagine - John Lennon");
        myPlayer.pause();
        myPlayer.adjustVolume(7);
        myPlayer.shuffle();
        myPlayer.stop();
    }
}