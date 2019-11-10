package OOPSBasics;

public class TryCatchBlock {
	
	public static void main(String[] args)
	{
		try
		{
			throw new ArithmeticException();
		}
		catch(NullPointerException e)
		{
		System.out.println("Exception not caught");
		}
		catch(ArithmeticException e)
		{
	    System.out.println("Arthimetic Exception is caught");
		}
		finally
		{
		System.out.println("Catch this uncaught exception");
		}
		
	}

}
