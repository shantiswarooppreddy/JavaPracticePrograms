package Java8Features;

@FunctionalInterface
interface ZeroParam
{
	public void ZeroParams();
}

@FunctionalInterface
interface OneParam
{
	public boolean OneParams(int a);
}

@FunctionalInterface
interface TwoParam
{
	public int TwoParams(int a, int b);
}

public class Lambdafunction {
	
	public static void main(String args[])
	{
		ZeroParam zeroParam = () -> {
			 System.out.println("This is a function within the first Interface");
		};
		
		zeroParam.ZeroParams();
		
		OneParam oneParam = (a) -> {
			if(a%2 == 0)
				return true;
			else
				return false;
		};
		
		if(oneParam.OneParams(5))
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
		
		TwoParam twoParam = (a, b) -> {
			return(a + b);
		};
		
		System.out.println("The sum 3 and 5 is " + twoParam.TwoParams(3, 5));
	}
}
