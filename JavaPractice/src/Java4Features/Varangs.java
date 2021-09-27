package Java4Features;

public class Varangs {
	
	public void print(String... value)
	{
		for(int i = 0; i < value.length; i++)
			System.out.println(value[i]);
	}
    
	public static void main(String args[])
	{
		new Varangs().print("Sample 1", "Sample 2", "Sample 3");
	}
}
