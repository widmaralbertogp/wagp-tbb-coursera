public class SideKick
{
        private int batteryCharge;

       /* Recharge the battery */
        public void rechargeBattery()
        {
            System.out.println("Recharging battery...");
        }

        /* Display battery level */
        public void displayBatteryLevel()
        {
            System.out.println("Battery level is: "+ batteryCharge);
        }

        /* Getter Method */
        public int getBatteryCharge()
        {
            return batteryCharge;
        }

        /* Setter Method */
        public void setBatteryCharge(int batteryCharge)
        {
            if (batteryCharge < 0)
            {
                batteryCharge = 0;
            }
            else
            {
                this.batteryCharge = batteryCharge;
            }
        }
}
