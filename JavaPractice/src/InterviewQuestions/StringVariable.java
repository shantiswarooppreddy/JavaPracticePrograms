package InterviewQuestions;

public class StringVariable {
	
	public static void main(String args[])
	{
		String var1 = "Java";
		String var2 = "Swaoop";
		
		if(var2.length() % 2 == 0)
			var2 = var2.substring(var2.length()/2, var2.length()) + var2.substring(0, var2.length()/2);
		else
			var2 = var2.substring(var2.length()/2 + 1, var2.length()) + var2.substring(var2.length()/2, var2.length()/2 + 1) 
			       + var2.substring(0, var2.length()/2);
		
		System.out.println((var1 + " " + var2).split(" ")[1]);	
		var2 = var1.concat(var2).substring(var1.length());
		System.out.println(var1);
		System.out.println(var2);
		
		
	}

}
