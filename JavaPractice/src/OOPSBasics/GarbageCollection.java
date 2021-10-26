package OOPSBasics;

public class GarbageCollection {
	
	public void finalize()
	{
		System.out.println("An object is Garbage collected");
	}
	
	public static void main(String args[])
	{
		GarbageCollection Object1 = new GarbageCollection();
		Object1 = null;
	    System.gc();
	}

}
