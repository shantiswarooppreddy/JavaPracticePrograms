package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
	    int a[] = new int[5];
	    
	    for(int i = 0; i < a.length; i++)
	    {
	    	a[i] = scan.nextInt();
	    }
	    
	    for(int i = 0; i < a.length - 1; i++)
	      for(int j = i + 1; j < a.length ; j++)
	      {
	    	  int temp;
	    	  if(a[i] < a[j])
	    	  {
	    		  temp = a[i];
	    	      a[i] = a[j];
	    	      a[j] = temp;
	    	  }      
	      } 
	    
	    for(int i: a)
	    	System.out.println(i);
	}
}
