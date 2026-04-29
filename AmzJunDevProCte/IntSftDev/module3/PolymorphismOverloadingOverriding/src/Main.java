public class Main 
{
    public static void main(String[] args)
    {
     /*   // Create a new Camera object
        Camera myFavoriteCamera = new Camera();

        // Take picture with default setting
        myFavoriteCamera.takePicture(); 

        // Take picture with a specific mode        
        myFavoriteCamera.takePicture("portrait"); 

        // Take picture with a specific resolution
        myFavoriteCamera.takePicture(12); 

        // Take picture with a specific mode and resolution        
        myFavoriteCamera.takePicture("landscape", 24); 

        System.out.println("");
        System.out.println("Initiating smart camera...");
        // Take picture with default setting
       */ 
        Camera mySmartCamera = new SmartCamera();
        mySmartCamera.takePicture();
    }
}