package InterviewQuestions;

public class Classsubarray {
	
	public int[] subArray(int[] arr,int sum){
           int temp = 0;
           int a[] = {0};
           int i, j;
	       for(i = 0; i < arr.length; i++)
	       {
	    	   if(arr[i] > sum)
	    		   continue;
	    	   
		       for(j = i; j < arr.length; j++)
		       {
	               temp = temp + arr[j];
	               if(temp == sum)
	               {
	            	   a = new int[j - i + 1];
	    		       int n = 0;
	    		       for(int k = i; k <= j; k++ )
	    		       {
	    		    	   System.out.println(k + " " + i + " " + j);
	    		    	   a[n] = arr[k];
	    		    	   System.out.println(k);
	    		    	   n++;
	    		       }
	               }
		       }
		       
		       if(temp == sum)
	    		   break;
		       temp = 0;
		           
	       }
	       return a; 

	}
	       
	 public static void main(String args[])
	 {
		 int arr[] = {1, 2, 3, 4, 5};
		 int a[] = new Classsubarray().subArray(arr, 8);
		 for(int i = 0; i < a.length; i++)
			 System.out.print(a[i] + " ");
	 }

}
