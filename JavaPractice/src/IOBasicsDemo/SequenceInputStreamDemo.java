package IOBasicsDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream Fin1 = new FileInputStream(System.getProperty("user.dir") + "\\Fout.txt");
		FileInputStream Fin2 = new FileInputStream(System.getProperty("user.dir") + "\\Fout2.txt");
		SequenceInputStream Sin = new SequenceInputStream(Fin1, Fin2);
		int i;
		while((i = Sin.read()) != -1)
			System.out.println((char)i);
		
	}

}
