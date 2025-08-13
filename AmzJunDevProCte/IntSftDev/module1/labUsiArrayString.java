public class Main {

    public static void main(String[] args) {
	System.out.print("\033[2J");
	System.out.print("\033[H");
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        int i = 0;
        do {
            System.out.println("Superhero Number " + i +" Name is: " + superheroes[i] );
            i++;
        }while (i<5);
        // Print the introduction years
        System.out.println("Introduction Years: ");
        i = 0;
        do {
            System.out.println("The Introduction Years of the Superhero " + superheroes[i] + " is: "+introductionYears[i]);
            i++;
        }while (i<5);
        System.out.println("The Original name of the third Superhero is: "+ superheroes[2]);
        superheroes[2] = "Thor";
        System.out.println("The modify name of the third Superhero is: " + superheroes[2]);
        System.out.println("The original year of introduction of the third Superhero: " + introductionYears[2]);
        introductionYears[2] = 2011;
        System.out.println("The modified year of introduction of the third Superhero: "+ introductionYears[2]);
        System.out.println("Total superheroes name in the String array is: "+ superheroes.length);
        System.out.println("Total superheroes introduction year in int array is: "+introductionYears.length);
    }
}
