package StringPractice;

class StringDemo {
	
	public String toString()
	{
		return("This is a sample String");
	}
}

public class ToStringandExtraction {
	
	public static void main(String[] args)
	{
		System.out.println(new StringDemo());
		
		String string1 = "This is a sample string";
		
		char chararray[] = new char[5];
		
		//Character at a particular place
		System.out.println(string1.charAt(1));
		
		//Extracting Bytes
		System.out.println(string1.getBytes());
		
		//Extracting Characters
		System.out.println(string1.toCharArray());
		
		//Getting a few characters into a character array
		string1.getChars(1, 5, chararray, 0);
		System.out.println(chararray);	
		
	}
	
}
