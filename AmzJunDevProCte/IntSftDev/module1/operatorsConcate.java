class reversingString
{
	public static void main(String[] args)
	{
		String str1 = "Hello";
		String str2 = "World";
		// Using the "+" operator
		String result1 = str1 + " " + str2;
		// Using the concat() method
		String result2 = str1.concat(" ").concat(str2);
		System.out.println("Result Of use operator + : " + result1);
		System.out.println("Result of use concat() Method: " + result2);
	}
}
