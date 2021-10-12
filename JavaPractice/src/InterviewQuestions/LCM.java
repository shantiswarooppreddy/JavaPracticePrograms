package InterviewQuestions;

public class LCM {
	
	public static void main(String args[])
	{
		int a = 2, b = 4, c = 10;
		int d = a*b*c;
		int temp = d;
		for(int i = 2; i <= a*b*c; i++)
			if(d%i == 0)
			{
				int temp1 = d/i;
			    if(temp1%a == 0 && temp1%b == 0 && temp1%c == 0)
				  temp = temp1;
		    }
		System.out.println(temp);
	}
}
 