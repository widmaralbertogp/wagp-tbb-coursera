public abstract class Robot {
    // move common properties
    private int batteryCharge;

    private int modeOfOperation;

    //  other common code list setters and getters

    // abstract method for menu
    public abstract void setChoice();

    // abstract method for action
    public abstract void takeAction();
}
