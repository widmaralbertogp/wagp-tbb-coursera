package Main.java;
public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        System.out.println("\nMedia Player Simulation.\n");
        player.start();
        player.increase(5);
        player.pause();
        player.decrease(3);
        player.stop();
        player.forward();
        player.backward(); 
        
        System.out.println("\n");
        System.out.println("Length Comparison.\n");

        Length l1 = new Length(4,5);
        Length l2 =new Length(2, 7);
        int retVal = l1.compareTo(l2);
        if (retVal==1)
            System.out.println("the first length is larger than the second");
        else
            System.out.println("the first length is less than or equal to the second");
        System.out.println("\n");
    }
    
}