package InterviewQuestions;

public class StringReverse {
	
	public static void main(String args[])
	{
		String sample = new String("Reverse the string");
		String sample2 = "";
		char[] c = new char[sample.length()];
		for(int i = 0; i < sample.length(); i++)
			c[sample.length() - 1 - i] = sample.charAt(i);
		
	    sample2 = new String(c);
	    System.out.println(sample2);
	}

}
