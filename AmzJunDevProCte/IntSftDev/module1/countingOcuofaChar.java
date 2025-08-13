class reversingString
{
	public static void main(String[] args)
	{
		String inputString = "Hello World";
		char targetChar = 'o';
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) 
		{
		    if (inputString.charAt(i) == targetChar) 
			{
			        count++;
			}
		}
		System.out.println("Number of occurrences of '" + targetChar + "': " + count);
	}
}
