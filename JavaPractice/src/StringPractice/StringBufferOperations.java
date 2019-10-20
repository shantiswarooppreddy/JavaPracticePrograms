package StringPractice;

public class StringBufferOperations {
	
	public static void main (String [] args)
	
	{
		StringBuffer string1 = new StringBuffer("This is a sample string");
		
		//Inserting Characters at a particular location
		string1.insert(10, "Perfect ");
		
		System.out.println(string1);
		
		//Reversing Strings
		System.out.println(string1.reverse());
		
		string1.reverse();
		
		//Deleting character yet
		System.out.println(string1.deleteCharAt(4));
		
		System.out.println(string1.delete(8, 15));
		
		//Replacing a particular string
		System.out.println(string1.replace(4, 9, " "));
		
		//Substring
		System.out.println(string1.substring(6).substring(0,6));
	}

}
