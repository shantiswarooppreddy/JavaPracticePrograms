package InterviewQuestions;

public class Varangsfunction {
	
	  int i;
	  
	  Varangsfunction(int i)
	  {
		  this.i = i;
	  }
	  Varangsfunction()
	  {
		  System.out.println("This constructor has been overloaded");
	  }
	
	  public void printString(String...strings)
	  {
		  for(int i = 0; i < strings.length; i++)
			  System.out.println(strings[i]);
	  }
	  
	  public void printitems(int...number)
	  {
		  for(int i = 0; i < number.length; i++)
			  System.out.println(number[i]);
	  }
	  
	  static
	  {
		  System.out.println("Hello main world");
	  }
	  
	  public static void main(String args[])
	  {
		  Varangsfunction v = new Varangsfunction();
		  System.out.println(v.i);
		  v = new Varangsfunction(1);
		  System.out.println(v.i);
	  }

}
