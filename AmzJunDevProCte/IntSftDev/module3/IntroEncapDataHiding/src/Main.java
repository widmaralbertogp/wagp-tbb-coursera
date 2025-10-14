public class Main
{
    public static void main(String[] args) 
    {
        /* create a SideKick robot object */
        SideKick sideKickObject = new SideKick();

        /* Recharge the battery */
        sideKickObject.rechargeBattery();

        /* Change from outside */
        sideKickObject.setBatteryCharge(90);

        /* Display battery level */
	    // sideKickObject.displayBatteryLevel();

        System.out.println("Battery level: " + sideKickObject.getBatteryCharge() );
     
    }
}