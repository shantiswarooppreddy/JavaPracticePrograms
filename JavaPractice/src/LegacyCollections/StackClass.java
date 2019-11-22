package LegacyCollections;

import java.util.Stack;

public class StackClass {
	
	public static void main(String args[])
	{
		Stack<Integer> si = new Stack<Integer>();
		
		for(int i = 1; i <=10; i++)
			si.push(new Integer(i));
		
		System.out.println(si.search(7));
		
		while(!si.empty())
			System.out.print(" " + si.pop());
	}

}
