class SimpleButton extends Button {
    private String text;

    @Override
    void onClick() {
        System.out.println("Simple Button says: Hello World!");
    }

    @Override
    void setText(String text) {
        this.text = text;
        System.out.println("SimpleButton text set to: " + this.text);
    }
}