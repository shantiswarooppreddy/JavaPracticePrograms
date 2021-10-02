package InterviewQuestions;

import java.util.Arrays;

public class SampleString {
	
	public static void main(String arg[])
	{
		String newstring = "abc abc dab abc dab abd";
		String[] strings = newstring.split(" ");
		
		Arrays.asList(strings).stream().distinct().forEach(s -> {
			System.out.println(s + " " + Arrays.asList(strings).stream().filter(t -> t.equals(s)).count());
		});
		
		String string1 = "abcd";
		String string2 = "efgh";
		char[] char1 = new char[string1.length() + string2.length()];
		int j = 0;
		for(int i = 0; i < string1.length(); i++)
		{ 
			char1[j] = string1.charAt(i);
			char1[j + 1] = string2.charAt(i);
			j = j + 2;
		}
		
		String string3 = new String(char1);
		System.out.println(string3);
	}

}
