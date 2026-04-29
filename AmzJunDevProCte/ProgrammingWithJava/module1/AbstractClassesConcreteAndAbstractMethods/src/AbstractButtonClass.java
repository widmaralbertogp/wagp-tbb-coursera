public abstract class AbstractButtonClass {
    String caption;
    String sendTo;   // ← MOVIDO AQUÍ

    public abstract void buttonPress();
    
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public String getCaption() {
        return this.caption;
    }
    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public String getSendTo() {
        return sendTo;
    }
}