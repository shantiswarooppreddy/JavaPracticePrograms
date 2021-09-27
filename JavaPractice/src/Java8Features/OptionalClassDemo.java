package Java8Features;

import java.util.Optional;

public class OptionalClassDemo {
	
	public static void main(String args[])
	{
		String[] stringArray = new String[10];
		
		Optional<String> checkNull = Optional.ofNullable(stringArray[5]);
		
		if(checkNull.isPresent())
			System.out.println(stringArray[5]);
		else
			System.out.println("This variable does not hold a value");
		
	}

}
