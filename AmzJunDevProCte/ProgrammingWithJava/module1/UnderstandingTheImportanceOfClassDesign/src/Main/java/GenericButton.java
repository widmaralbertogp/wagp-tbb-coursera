/*
abstract class GenericButton {
   //instance variables
    private String caption;
    private String iconPath;
    void setCaption(String newCaption) {
        //concrete method
        this.caption = caption;
    }
    void setIcon(String iconPath) {
        //another concrete method
        this.iconPath = iconPath;
    }    
}*/

public abstract class GenericButton {
    abstract void onClick();
}
