package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Maximumremoval {
	
	public static int Solution(String S)
	{
		 List<Character> C = new ArrayList<>();
		 for(int i = 0; i < S.length(); i++)
			 C.add(S.charAt(i));
		 
		 int OccurencesofB = (int) C.stream().filter(s -> s == 'B').count();
		 int OccurencesofA = (int) C.stream().filter(s -> s == 'A').count();
		 int OccurencesofL = (int) C.stream().filter(s -> s == 'L').count();
		 int OccurencesofO = (int) C.stream().filter(s -> s == 'O').count();
		 int OccurencesofN = (int) C.stream().filter(s -> s == 'N').count();
		 int i = 0;
		 while(true)
		 {
			 if(OccurencesofB < (i + 1))
				 break;
			 if(OccurencesofA < (i + 1))
				 break;
			 if(OccurencesofL <  2*(i + 1))
				 break;
			 if(OccurencesofO < 2*(i + 1))
				 break;
			 if(OccurencesofN < i + 1)
				 break;
			 i = i + 1;
		 }
			 
		  return i;
	}
	
	
	public static void main(String arg[])
	{
		int i = Solution("BALLOONGBALLOONBALLOONHN");
		System.out.println(i);
	}

}
