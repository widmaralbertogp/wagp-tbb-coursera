public class TextButton extends GenericButton implements ButtonClick {

    private String caption;

    public TextButton(String caption) {
        this.caption = caption;
    }

    @Override
    public void onClick() {
        System.out.println("TextButton [" + caption + "] clicked!");
    }
}
