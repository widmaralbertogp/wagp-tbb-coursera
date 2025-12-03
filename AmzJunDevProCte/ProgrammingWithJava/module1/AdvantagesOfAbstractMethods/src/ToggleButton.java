class ToggleButton extends Button {
    private String text;
    private boolean state = false;

    @Override
    void onClick() {
        state = !state;
        System.out.println("ToggleButton changed state to: " + (state ? "ON" : "OFF"));
    }

    @Override
    void setText(String text) {
        this.text = text;
        System.out.println("ToggleButton text set to: " + this.text);
    }
}