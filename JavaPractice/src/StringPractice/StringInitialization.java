package StringPractice;

public class StringInitialization {
	
	public static void main (String [] args)
	{
		
		//Initializing a string a blank character
		
		String string1 = new String();
		
		System.out.println(string1);
		
		//Initializing a string with a constant
		
		String string2 = new String("Hello World");
		
		System.out.println(string2);
		
		//Initializing a string with a char array
		
		char charArray[] = {'a','b','c','d','e','f'};
		
		String string3 = new String(charArray);
		
		System.out.println(string3);
		
		//Initializing a string with a part of the character array
		String string4 = new String(charArray, 2, 3);
		
		System.out.println(string4);
		
		//Initializing a string with a byte array
		byte bytearray[] = {65, 66, 67, 97, 98, 99};
		
		String string5 = new String(bytearray);
		
		System.out.println(string5);
		
		//Initializing a string from the part of byte array
		
	    String string6 = new String(bytearray, 2, 4);
	    
	    System.out.println(string6);
	    
	    //Initializing a string using a string literal
	    String string7 = "abc";
	    
	    System.out.println(string7);
	    
	    //Strings are immutable and can also be initialized with String Builder as well as String Buffer objects
		
		
	}

}
