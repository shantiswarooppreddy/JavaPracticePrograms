package StringPractice;

public class StringBuilderExample {
	
	public static void main(String args[])
	{
		StringBuilder strbud = new StringBuilder();
		
		        //Appending Characters
		
				strbud.append('a');
				strbud.append(1);
				strbud.append(2.00);
				
				//Displaying the length and Capacity of a String Buffer
				
				System.out.println (strbud);
				System.out.println (strbud.length());
				System.out.println (strbud.capacity());
				
				//Defining the length of a particular String Buffer
				strbud.setLength(6);
				System.out.println(strbud.length());
				strbud.ensureCapacity(12);
				System.out.println(strbud.capacity());
	}

}
