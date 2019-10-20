package CollectionsPractice;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main (String [] args)
	{
		//Same or der as inserted
		
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		hs.add(1);
		hs.add(55);
		hs.add(57);
		hs.add(3);
		
		System.out.println (hs);
	}

}
