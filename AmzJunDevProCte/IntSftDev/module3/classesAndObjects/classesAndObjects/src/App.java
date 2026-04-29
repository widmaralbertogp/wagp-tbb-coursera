public class App 
{
    public static void main(String[] args)
    {
        Hero fireFist = new Hero();
        fireFist.name = "Fire Fist";
        System.out.println("Name of the Hero: " + fireFist.name);

        int punchDamage = fireFist.calculatePunchDamage();
        System.out.println("Ouch, your punch caused " + punchDamage + "% damage.");
        
        Hero frostBlizzard = new Hero();
        frostBlizzard.name = "Frost Blizzard";
        frostBlizzard.strength = 35;

        int specialAttackDamage = frostBlizzard.calculateSpecialAttackDamage("Ice Blast");
        System.out.println("Your Ice Blast Scorches for " + specialAttackDamage + "% damage.");
    } 
}