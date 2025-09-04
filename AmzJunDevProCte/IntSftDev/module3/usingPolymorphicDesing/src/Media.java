public class Media {
    String title;
    String creator;

    public Media(String title, String creator)
    {
        this.title = title;
        this.creator = creator;
    }

    public void play()
    {
        System.out.println("Play " + title + " by " + creator);
    }
}
