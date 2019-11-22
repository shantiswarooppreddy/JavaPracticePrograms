package IOBasicsDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	
	public static void main(String args[]) throws IOException
	{
		FileWriter Fr = new FileWriter(System.getProperty("user.dir") + "\\Fout2.txt");
		Fr.append("This is the first sentence\n");
		Fr.append("This is the second sentence\n");
		Fr.append("This is the third sentence\n");
		Fr.append("This is the fourth sentence\n");
		Fr.append("This is the fifth sentence\n");
		Fr.close();
		
		FileReader Fd = new FileReader(System.getProperty("user.dir") + "\\Fout2.txt");
		char c;
		while((c = (char) Fd.read()) == -1)
			System.out.print(c);
	}
	
}
