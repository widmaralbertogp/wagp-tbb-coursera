public class forwardButton extends AbstractButtonClass {

    String forwardTo;

    public void setForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
    }

    @Override
    public void buttonPress() {
        System.out.println("Forwarding this post to: " + this.sendTo);
    }
}
