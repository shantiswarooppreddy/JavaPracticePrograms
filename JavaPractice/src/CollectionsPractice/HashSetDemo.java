package CollectionsPractice;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main (String [] args)
	{
		
		//elements will be displayed in a random order
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(1);
		hs.add(55);
		hs.add(57);
		hs.add(3);
		
		System.out.println (hs);
		
	}

}
