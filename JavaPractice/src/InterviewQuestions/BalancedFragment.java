package InterviewQuestions;

public class BalancedFragment {
	
	public static boolean extractsubstring(String S, int i)
	{
		for(int j = 0; j <= S.length() - i; j++)
		{
			System.out.println(S.substring(j, j + i));
			if(balanced(S.substring(j, j + i)))
				return true;
		}
		
		return false;
	}
	
	private static boolean balanced(String substring) 
	{
		boolean flag = true;
		for(int i = 0; i < substring.length(); i++)
		{      
			   
		       char c = (char) (substring.charAt(i) + 32);
		       char d = (char) (substring.charAt(i) - 32);
		       System.out.println(c); 
		       if(substring.indexOf(c) == -1 && substring.indexOf(d) == -1)
		       {   
		    	   flag = false;
		           break;
		       }    
		}
		
		return flag;
	}

	public static int solution(String S)
	{
		for(int i = 2; i <= S.length(); i++)
			if(extractsubstring(S, i))
				return i;	
		return -1;	
	}
	
	public static void main(String arg[])
	{
		int i = solution("test");
		System.out.println(i);
	}

}
