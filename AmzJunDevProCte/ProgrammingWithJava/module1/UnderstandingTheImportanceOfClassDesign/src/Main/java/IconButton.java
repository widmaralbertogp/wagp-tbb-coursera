public class IconButton extends GenericButton implements ButtonClick {

    private String iconPath;

    public IconButton(String iconPath) {
        this.iconPath = iconPath;
    }

    @Override
    public void onClick() {
        System.out.println("IconButton [" + iconPath + "] clicked!");
    }
}
