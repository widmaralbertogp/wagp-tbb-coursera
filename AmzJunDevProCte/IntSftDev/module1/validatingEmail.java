import java.util.regex.Pattern;

class validatingEmail
{
	public static void main(String[] args)
	{
		public class EmailValidator
		{
			private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		 	private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);
			public static boolean isValid(String email)
			{
        			return pattern.matcher(email).matches();
			}
		}
		String email = "test@example.com";
		boolean isValidEmail = EmailValidator.isValid(email);
		System.out.println("Is email valid? " + isValidEmail);
	}
}
