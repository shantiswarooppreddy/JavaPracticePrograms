package Java8Features;

import java.util.Arrays;

public class ParallelSort {
	
	public static void main(String args[])
	{
		int[] a = {1, 4, 7, 8, 3, 5, 7, 10};
		
        Arrays.parallelSort(a);
        for(int i: a)
        	System.out.println(" "+ i);
	}

}
