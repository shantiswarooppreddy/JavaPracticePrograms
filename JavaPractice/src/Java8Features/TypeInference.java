package Java8Features;

import java.util.ArrayList;
import java.util.List;

class listPrint{
	public static void Print(List<Integer> list)
	{
		if(!list.isEmpty())
			list.forEach(System.out::println);
		else
		    System.out.println("The list is empty");
	}
}
public class TypeInference{              
	public static void main(String args[])
	{
		listPrint.Print(new ArrayList<>());
	}
}