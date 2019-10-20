package OOPSBasics;

public class GotoStatement {
	
	public static void main (String [] args)
	
	{
		
		System.out.println ("Before the Goto Statement");
		
		label:
		{
		
		System.out.println ("After the goto statement and before the label");
		
		break label;
		}
	}

}
