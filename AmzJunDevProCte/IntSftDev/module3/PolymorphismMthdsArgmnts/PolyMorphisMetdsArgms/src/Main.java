public class Main {
    public static void main(String[] args)
    {
        Camara myFavoriteCamera = new Camara();
        myFavoriteCamera.takePicture("portrait"); 
        myFavoriteCamera.takePicture(12); 
        myFavoriteCamera.takePicture("Landscape", 24); 
    }
}
