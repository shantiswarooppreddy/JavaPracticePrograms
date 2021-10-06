package InterviewQuestions;

public class SumInaAlphaNumericString {
	
	public static void main(String arg[])
	{
		String string = "a1b2c3";
		int j = 0;
		
		for(int i = 0; i < string.length(); i++)
		{
			try {
			j += Integer.valueOf(string.substring(i, i + 1));
			}
			catch (Exception e)
			{
				continue;
			}
		}
		System.out.println(j);
	}

}
