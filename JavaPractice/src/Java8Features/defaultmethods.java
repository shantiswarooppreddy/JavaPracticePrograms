package Java8Features;

interface methods
{
	default void Print()
	{
		System.out.println("The is a smaple Print Function");
	}
	
	static void Print1()
	{
		System.out.println("The is a sample Print1 Function");
	}
}

public class defaultmethods implements methods{
	
	public static void main(String args[])
	{
		new defaultmethods().Print();
		methods.Print1();
		
	}

}
