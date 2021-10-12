package InterviewQuestions;

import java.util.Arrays;

public class SecondMaximumElement {
	
	public static void main(String args[])
	{
		int[] a = {1, 4, 6, 9, 15, 15, 7, 9};
		Arrays.parallelSort(a); 
		int temp;
		temp = a[a.length - 1];
		for(int i = a.length - 2; i >= 0; i--)
		    if(temp != a[i])
		    {
		    	System.out.println(a[i]);
		    	break;
		    }
	}

}
