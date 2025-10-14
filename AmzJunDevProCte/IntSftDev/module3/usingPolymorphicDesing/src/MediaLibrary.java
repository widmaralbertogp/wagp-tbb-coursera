public class MediaLibrary 
{
    //Method to add media to the library
    public Media addMedia(Media mediaItem) 
    {
        System.out.println("Added " + mediaItem.title + " to the library." );
        return mediaItem;
    }
    
    //Method to play the media item
    public void playMedia(Media mediaItem)    
    {   
        mediaItem.play(); // calls the appropiate play mehod based on the type of media
    }
}
