package InterviewQuestions;

public class Duplicate {
	
	public static void main(String args[])
	{
	   int a[] = {7, 7, 6, 1, 1, 2, 3, 4, 5, 1};
	   
	   for(int i = 0; i < a.length; i++)
	   {
		   int k = 0;
		   for(int j = 0; j < a.length; j++)
			   if(a[i] == a[j] && a[j]!= 0)	
			   {
		         k++;
		         if(i!=j)
		         a[j] = 0;
			   }
			
		   if(k > 1)
			   System.out.println("The number " + a[i] + " is a duplicate and is displayed " + k + " times");
	   }
	   
	   
	   
	}

}
