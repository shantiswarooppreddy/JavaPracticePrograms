package LegacyCollections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args)
	{ 
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println(v.capacity());
		
		System.out.println(v.size());
		
		for(int i = 1; i <= 10; i++)
		v.addElement(new Integer(i));
		
		Enumeration vNum = v.elements();
		
		while(vNum.hasMoreElements())
			System.out.print(vNum.nextElement());
		
		System.out.println("\nUsing the next Iterator");
		
		Iterator<Integer> Il = v.iterator();
		
		while(Il.hasNext())
			System.out.print(Il.next());
		
		System.out.println("\nUsing the for loop");
		
		for(int i: v)
			System.out.print(i);
		
	}

}
