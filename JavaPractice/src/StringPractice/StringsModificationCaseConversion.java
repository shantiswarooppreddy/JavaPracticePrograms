package StringPractice;

public class StringsModificationCaseConversion {
	
	public static void main(String [] args)
	{
		String s1 = " this is a sample world ";
		
		//Removing leading and trailing white spaces
		System.out.println(s1.trim());
		
		//Replace characters
		System.out.println(s1.replace('l', 'w'));
		
		//Strings Replace
		System.out.println(s1.replace("world", "word"));
		
		//Concatenating
		System.out.println(s1.concat("from here"));
		
		//Substring extraction
		System.out.println(s1.substring(0));
		
		System.out.println(s1.trim().substring(0, 4));
		
		//Case Conversion
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.toUpperCase());
				
	}

}
