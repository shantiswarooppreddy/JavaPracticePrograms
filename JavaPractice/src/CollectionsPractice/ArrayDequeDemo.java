package CollectionsPractice;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	
	public static void main(String [] args)
	{
		ArrayDeque<String> Ad = new ArrayDeque<String>();
		
		Ad.add("Sample");
		Ad.add("Notice");
		Ad.add("Variable");
		Ad.add("Location");
		Ad.add("Implementation");
		Ad.add("figure");
		
		while(Ad.peek()!= null)
			System.out.println(Ad.pop());
		
			
	}

}
