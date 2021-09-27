package InterviewQuestions;
import java.util.Collections;
import java.util.Scanner;

public class Palindrome {
    public static boolean Palindrome(String x)
    {
        if(x.length() == 1)
        {
            return true;
        }
        else if(x.charAt(0) == x.charAt(x.length() - 1))
        {
            if(x.length() == 2)
               return true;
            else
               return Palindrome(x.substring(1, x.length() -1));
        }
        else
               return false;
    }
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        
        System.out.println(Palindrome(x));
        
        
      
    }
}