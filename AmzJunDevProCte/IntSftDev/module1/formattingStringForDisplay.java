public class NameFormatter {
	public static String formatName(String firstName, String lastName) 
	{
        	return String.format("Name: %s, %s", lastName.toUpperCase(), firstName);
    }
}
