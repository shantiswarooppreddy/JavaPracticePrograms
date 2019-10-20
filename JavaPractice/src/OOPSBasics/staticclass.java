package OOPSBasics;

class staticdemo 
{
	static int a = 1;
	
	static void function() 
	{
		System.out.println("Inside");
	}
	
	static 
	{
		System.out.println("Inside the class");
	}
}

public class staticclass {

	public static void main (String[] main)
	{
		System.out.println(staticdemo.a);
		staticdemo.function();
	}
}
