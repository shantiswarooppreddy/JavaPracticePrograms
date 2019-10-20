package OOPSBasics;

class class1 
{
	void printer ()
	{
		System.out.println ("Inside the super class");
	}
}

class class2 extends class1
{
	void printer ()
	{
		System.out.println("Inside the sub class");
	}
}

public class methodoverriding {
	
	public static void main(String args[])
	{
		class2 a =  new class2();
		class1 b =  new class2();
		a.printer();
		b.printer();
		
	}

}
