package IOBasicsDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	
	public static void main(String args[]) throws IOException
	{
		FileWriter Fr = new FileWriter(System.getProperty("user.dir") + "\\Fout2.txt", true);
		Fr.append("This is the six sentence\n");
		Fr.append("This is the seven sentence\n");
		Fr.append("This is the eighth sentence\n");
		Fr.append("This is the ninth sentence\n");
		Fr.append("This is the tenth sentence\n");
		Fr.close();
		
		FileReader Fd = new FileReader(System.getProperty("user.dir") + "\\Fout2.txt");
		int i = Fd.read();
		while(i != -1)
		{
			System.out.print((char)i);
		    i = Fd.read();
		}
		Fd.close();
	}
	
}
