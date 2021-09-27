package Java8Features;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAndFilters {
	
	public static void main(String args[])
	
	{
	
	String[] string = {"Adam", "Bob", "John", "William", "Christian", "Kumar", "Rick", "Stellar"};
	
	//Printing all the Elements after sorting it
	Arrays.asList(string).stream().sorted().forEach(s -> System.out.println(s));
	
	//Printing all the Elements starting with W
	Arrays.asList(string).stream().filter(s -> s.startsWith("W")).forEach(s -> System.out.println(s));
	
	String[] string2 = {"Square", "Triangle", "Circle", "Rectangle", "Square", "Circle"};
	
	//Printing all the Element and times they are displayed
	Arrays.asList(string2).stream().distinct().forEach(s -> {
              System.out.println(s + " " + Arrays.asList(string2).stream().filter(t -> t.equals(s)).count());
	
	});
	
	}

}
