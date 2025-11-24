public abstract class AbstractButtonClass {
    String caption;
    public abstract void buttonPress();
    
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public String getCaption() {
        return caption;
    }
}