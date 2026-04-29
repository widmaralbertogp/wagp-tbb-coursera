public class App {
    public static void main(String[] args) {
        SendButtonClass sendButton = new SendButtonClass();
        sendButton.setCaption("Send Button");
        sendButton.setSendTo("recipient@example.com");
        sendButton.setMessage("Hola Mundo");
        sendButton.buttonPress();


        likeButton like = new likeButton();
        like.setCaption("Like");
        like.buttonPress();

        forwardButton forward = new forwardButton();
        forward.setCaption("Forward");
        //forward.setForwardTo("friend@example.com");
        forward.setSendTo("recipient@example.com"); // reutiliza el mismo campo        
        forward.buttonPress();
    }
}