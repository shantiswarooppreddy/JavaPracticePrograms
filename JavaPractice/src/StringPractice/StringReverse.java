package StringPractice;

public class StringReverse {
	
	public static void main(String args[])
	{
		String s = "I am here";
		char c[] = new char[s.length()];
		int j = 1;
		
		for(int i = 0; i < s.length(); i++)
		{
			c[s.length() - 1 - i] = s.charAt(i);
			
			if(s.charAt(i)==' ')
				j++;
			
		}
		
		String s1 = new String(c);
		
		System.out.println(j);
		
		
				
	}
	

}
