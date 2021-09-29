package InterviewQuestions;

import java.util.Arrays;

public class SmallestPositiveInteger {
	
	public static void main(String args[])
	{
		int[] A = {1, 2, 1, 3, 4, 6};
		Arrays.parallelSort(A);
        if(A[A.length -1] <= 0)
			System.out.println(1);
		else
			for(int i = 1; i <= A[A.length -1]; i++)
			{	
				if(Arrays.binarySearch(A, i) <= -1)
				{    
					System.out.println(i); 
					break; 
				}
				else if (i == A[A.length -1])
					 System.out.println(A[A.length - 1] + 1);
			}		
	}

}
