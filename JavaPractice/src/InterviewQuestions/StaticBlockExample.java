package InterviewQuestions;

public class StaticBlockExample {
	
	static
	{
		System.out.println("This is in a static block");
	}
	
	static
	{
		System.out.println("This is in a static block2");
	}
	
	public static void main(String args[])
	{
		System.out.println("Inside the main function");
		String str= "welxyzcome and xyz more xyz more xyz";
		String[] string = str.split("xyz");
		StringBuffer strbuf = new StringBuffer("");
		for(int i = 0; i < string.length; i++)
			strbuf.append(string[i] + "abc");
		System.out.println(strbuf);
		
	}

}
