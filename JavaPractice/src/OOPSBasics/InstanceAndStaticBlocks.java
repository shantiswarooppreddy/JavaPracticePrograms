package OOPSBasics;

class C {
	C(){
		System.out.println("In contructor C");
	}
	{
		System.out.println("In initialization block of C");
	}
	static {
		System.out.println("In static block of C");
	}
}

public class InstanceAndStaticBlocks extends C{
	InstanceAndStaticBlocks()
	{
		System.out.println("In contructor ConstructorsQ1");
	}
	{
	    System.out.println("In initialization block of ConstructorInitQ1");
	}
static 
    {
	    System.out.println("In static block of ConstructorInitQ1");
	}
	public static void main(String args[]) {
		InstanceAndStaticBlocks t1 = new InstanceAndStaticBlocks();
	}}
