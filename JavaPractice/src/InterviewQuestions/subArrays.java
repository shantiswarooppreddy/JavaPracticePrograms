package InterviewQuestions;

public class subArrays {
	
	public static void main(String args[])
	{
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int m = 7;
		int sumModulo = 0;
		
		for(int i = 0; i < a.length; i++)
			for(int j = 0; j < a.length - i; j++)
			{
				for(int k = j; k < j + i + 1; k++ )
					sumModulo += a[k];
				System.out.println(sumModulo);
				sumModulo = 0;
			}
		    
	}

}
