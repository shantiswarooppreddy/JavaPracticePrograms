package OOPSBasics;

interface interface1 {
	
	int a = 1; 
	
	public void simple (int a);
	
}

abstract class class4 implements interface1
{
	int a = 2;
}

class class5 extends class4
{
	int a = 3; 
	public void simple(int a)
	{
	 System.out.println(a);
	}
}

public class InterfaceandAbstractClass {
	
	public static void main(String [] args)
	{
		
		class4 f2 = new class5();
		class5 f3 = new class5();
		System.out.println(f2.a);
		System.out.println(interface1.a);
		System.out.println(f3.a);
	}

}
