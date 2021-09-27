package OOPSBasics;

public class ExtendingExceptionClass extends Exception {
	
	public ExtendingExceptionClass(String Str)
	{
		super(Str);
	}
	
	public static void main(String args[]) throws Exception
	{
		throw new ExtendingExceptionClass("This is a sample exception");
	}

}
