package Java8Features;

import java.util.ArrayList;
import java.util.List;

public class forEach {
	
	public static void main(String args[])
	{
	     List<String> s = new ArrayList<>();
	     s.add("One");
	     s.add("Two");
	     s.add("Three");
	     s.add("Four");
	     
	     s.forEach(s1 -> System.out.println(s1));
	     s.stream().forEachOrdered(s1 -> System.out.println(s1));
	}

}
