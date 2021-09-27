package InterviewQuestions;

import java.util.Scanner;

class InterviewProblem1{
	   public static void main(String args[])
	   {
		   Scanner Scan = new Scanner(System.in);
		   int numberOfSoldiers = Scan.nextInt();
		   Scan.close();
		   
		   System.out.println("Solving Josephus problem for "+ numberOfSoldiers +" soldiers:");
		 
		   if(numberOfSoldiers == 1 || numberOfSoldiers == 2)
		   {
			 System.out.println("Josephus should sit on position# 1");
		   }
		   else
		   {
			 boolean k = true;
			 int j = 0;
			 int Killer = -1, Killed = -1;
			 int[] a = new int[numberOfSoldiers];
			 for(int i = 0; i < numberOfSoldiers; i++)
			      a[i] = 1;
			 while(true)
			 {
			     if(a[j] == 1 && k == true)		  
				 { 
			    	 k = false; 
			    	 Killer = j; 
			     }
			     else if(a[j] == 1 && k == false)
				 { 
			    	 k = true; 
			    	 Killed = j;  
			    	 a[j] = 0;
			    	 
			    	 if(Killer != Killed)
						  System.out.println((Killer + 1) + " Kills " + (Killed + 1));
					     else
						 {
						   System.out.println("Josephus should sit on position# " + (Killer + 1));
					       break;
						 }
			     }
			      
			     if(j == numberOfSoldiers -1)
					j = 0;
				 else
					j++;
			     			     
			 }
		   }	 
		   
	   }	 
	} 
