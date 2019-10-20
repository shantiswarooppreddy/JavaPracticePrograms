package StringPractice;

public class stringBufferDemo {
	
	public static void main(String [] args)
	{
		StringBuffer strbuf = new StringBuffer();
		
		//Appending Characters
		
		strbuf.append('a');
		strbuf.append(1);
		strbuf.append(2.00);
		
		//Displaying the length and Capacity of a String Buffer
		
		System.out.println (strbuf);
		System.out.println (strbuf.length());
		System.out.println (strbuf.capacity());
		
		//Defining the length of a particular String Buffer
		strbuf.setLength(6);
		System.out.println(strbuf.length());
		strbuf.ensureCapacity(12);
		System.out.println(strbuf.capacity());
	}

}
