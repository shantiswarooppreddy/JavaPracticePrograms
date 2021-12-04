package InterviewQuestions;

public class JavaProgram {
	
	public static void main(String args[])
	{
		String word = new String("Tall Tree");
		char[] wordarray = new char[word.length()];
		for(int i = 0; i < wordarray.length; i++)
		{
			if(Character.isUpperCase(word.charAt(i)))
					wordarray[i] = Character.toLowerCase(word.charAt(i));
			else
				    wordarray[i] = Character.toUpperCase(word.charAt(i));
					
		}
		
		System.out.println(new String(wordarray));
	}

}
