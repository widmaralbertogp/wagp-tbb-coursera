public class Main 
{
    public static void main(String[] args) 
    {
        // Create a new book object
        Book greatGatsbyBook = new Book("The Great Gatzby","F. Scott Fitsgerald",180);
        
        // Create a new Movie object
        Movie inceptionMovie = new Movie("Inception","Chistopher Nolan",148);

        // Create a new Music object
        Music imagineMusic = new Music("Imagine","John Lennon","Rock");

        // Create a MediaLibrary object
        MediaLibrary library = new MediaLibrary();

        // Add the media items to the library and store the returned objets
        System.out.println("");
        System.out.println("----------------- Adding new media items ----------");
        Media addedBook = library.addMedia(greatGatsbyBook);
        Media addedMovie = library.addMedia(inceptionMovie);
        Media addedMusic = library.addMedia(imagineMusic);
        System.out.println("---------------------------------------------------");
        System.out.println("");
        // Play the media items using the returned objects
        System.out.println("----------------- Playing the media items ----------");
        library.playMedia(addedBook); // calls the play method in the Book class
        library.playMedia(addedMovie);// calls the play method in the Movie class
        library.playMedia(addedMusic);// calls the play method in the Music class
        System.out.println("---------------------------------------------------");
    }
}