package Java8Features;

@FunctionalInterface
interface PrintDemo{
	public void printDemo();
}

public class MethodInstanceDemo {
	
	public void SamplePrint()
	{
		System.out.println("The sample of a variable");
	}
	
	public static void main(String args[])
	{
		PrintDemo Demo = new MethodInstanceDemo()::SamplePrint;
		Demo.printDemo();
	}
	
}
