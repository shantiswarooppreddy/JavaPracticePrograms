package InterviewQuestions;

interface sample{
	
	public void abstractmethod(int i, int j);
}

abstract class abstractclass implements sample{

}

public class Implementation extends abstractclass{
	
	  public void abstractmethod(int i, int j)
	  {
		  System.out.println(i + j);
	  }
	
}
	

