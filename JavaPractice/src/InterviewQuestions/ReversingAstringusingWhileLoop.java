package InterviewQuestions;

public class ReversingAstringusingWhileLoop {
	
	public static void main(String args[])
	{
		String s = "Sample String";
		int i = 0;
		char[] charArray = new char[s.length()];
		while(i < s.length())
		{
			charArray[s.length() - 1 - i] = s.charAt(i);
			i++;
		}
		
		s = new String(charArray);
		System.out.println(s);
	}

}
