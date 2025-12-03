public class App {
    public static void main(String[] args) throws Exception {
        SendButtonClass sendButton = new SendButtonClass();
        sendButton.setCaption("Send");
        System.out.println("===================== Send Button Class  =================");
        sendButton.setSendTo("a@b.com");
        sendButton.setMessage("Hello, World!");
        sendButton.buttonPress();
        System.out.println();
        sendButton.setSendTo("test@example.com");
        sendButton.setMessage("This is a test message.");
        sendButton.buttonPress();
        System.out.println();
        sendButton.setSendTo("user@example.com");
        sendButton.setMessage("You have been registered successfully.");
        sendButton.buttonPress();
        System.out.println();
        sendButton.onButtonHover();
        System.out.println();



        ForwardButtonClass forwardButton = new ForwardButtonClass();
        System.out.println("===================== Forward Button Class  =================");
        forwardButton.setCaption("Forward");
        forwardButton.setForwardTo("x@y.com");
        forwardButton.setMessage("Hello World");
        System.out.println();
        forwardButton.buttonPress();
        System.out.println();
        forwardButton.onButtonHover();
    }
}