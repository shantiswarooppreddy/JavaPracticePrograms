package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
	
	public static void main(String args[])
	{
		List<Integer> listOfIntegers = new ArrayList<Integer>();
		
		//Adding a new numbers
		listOfIntegers.add(13);
		listOfIntegers.add(14);
		listOfIntegers.add(15);
		
		//Adding Integers using the Collection Algorithms
		Collections.addAll(listOfIntegers, 16, 17, 18, 19);
		
		//Printing the Maximum Number
		System.out.println(Collections.max(listOfIntegers));
		
		//Printing the Minimum Number
		System.out.println(Collections.min(listOfIntegers));
		
		//Printing the Collection before sorting
		System.out.println(listOfIntegers);
		
		//Sorting the Collections
		Collections.sort(listOfIntegers, Collections.reverseOrder());
		
		//Printing after Sorting
		System.out.println(listOfIntegers);
		
	}

}
