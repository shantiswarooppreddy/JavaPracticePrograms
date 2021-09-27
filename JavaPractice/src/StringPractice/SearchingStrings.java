package StringPractice;

public class SearchingStrings {
	
	public static void main(String args[])
	{
		String string1 = "This is a sample string";
		
		//Last Index of and the first Index
		
		System.out.println(string1.indexOf('i'));
		
		System.out.println(string1.lastIndexOf('l'));
		
		//Last Index of and the first Index of a string
		
        System.out.println(string1.indexOf("is"));
		
		System.out.println(string1.lastIndexOf("is"));
		
		//First Index from a particular point
		System.out.println(string1.indexOf('s', 5));
		
		//Last Index from a particular point
		System.out.println(string1.lastIndexOf('s',5));
	}

}
