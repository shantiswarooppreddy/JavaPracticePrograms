package StringPractice;

public class DictionaryOrder {
	
	public static void main (String args[])
	{
		String string1 = "Now";
		String string2 = "now";
		String string3 = "this";
		
		//Comparing without ignoring Case
		System.out.println(string1.compareTo(string2));
		
		//Comparing with ignoring Case
		System.out.println(string1.compareToIgnoreCase(string2));
		
		//General Comparison
		System.out.println(string1.compareTo(string3));
	}

}
