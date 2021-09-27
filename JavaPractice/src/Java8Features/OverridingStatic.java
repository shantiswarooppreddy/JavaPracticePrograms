package Java8Features;

import java.util.function.BiFunction;

class staticMethods{
	
	static int sum(int a, int b)
	{
		return(a + b);
	}
	      
	static float sum(float a, float b)
	{
		return(a + b);
	}
}

public class OverridingStatic {
	
	public static void main(String args[])
	{
	  BiFunction<Integer, Integer, Integer>add  = staticMethods::sum;
	  BiFunction<Float, Float, Float>add1  = staticMethods::sum;
	  System.out.println(add.apply(3,5));
	  System.out.println(add1.apply((float) 3.0, (float) 5.0));
	}
}
