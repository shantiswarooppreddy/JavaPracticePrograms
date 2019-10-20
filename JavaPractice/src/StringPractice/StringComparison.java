package StringPractice;

public class StringComparison {
	
	public static void main(String[] args)
	{
		String string1 = "This is a sample String";
		
		String string2 = "THIS IS A SAMPLE string";
		
		//Comparing both the strings 
		
		System.out.println(string1.equals(string2));
		
		//Comparing both the strings from a particular case
		
		System.out.println(string1.equalsIgnoreCase(string2));
		
		//Comparing a particular region of the string with a region of the other string
		
		System.out.println(string1.regionMatches(10, string2, 10, 5));
		
		//Comparing a particular region of the string with a region of the other string by ignoring case
		
		System.out.println(string1.regionMatches(true, 10, string2, 10, 5));
		
		//Comparing whether a string starts with a particular string
		
		System.out.println(string1.startsWith("This"));
		
		//Comparing whether a string starts with a particular string from a particular point
		System.out.println(string1.startsWith("is", 5));
		
		//Comparing whether a string ends with a particular string
		System.out.println(string1.endsWith("string"));
	}

}
