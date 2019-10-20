package OOPSBasics;

class start 
{
	void printer (int d)
	{
		System.out.println("This is an integer");
	}
	void printer (double a)
	{
		System.out.println("This is a double value");
	}
}

public class methodOverloadingDemo {
	
	public static void main (String [] args)
	{
		start s = new start();
		
		s.printer(2);
		s.printer(2.0);
	}

}
