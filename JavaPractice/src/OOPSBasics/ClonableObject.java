package OOPSBasics;

public class ClonableObject implements Cloneable {
	
	int a, b;
	
	ClonableObject(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	
	public Object clone()throws CloneNotSupportedException
	{  
		return super.clone();  
	}  
	
	
	public static void main(String args[]) throws CloneNotSupportedException
	{
		ClonableObject clone = new ClonableObject(1,6);
		ClonableObject clone1 = (ClonableObject)clone.clone();
		System.out.println(clone1.a + " " + clone1.b);
	}

}
