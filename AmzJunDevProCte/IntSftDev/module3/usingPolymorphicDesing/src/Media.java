public class Media {
    String title;
    String creator;

    public Media(String title, String creator)
    {
        this.title = title;
        this.creator = creator;
    }

    //method to play the media item
    public void play()
    {
        System.out.println("Playing " + title + " by " + creator);
    }
}