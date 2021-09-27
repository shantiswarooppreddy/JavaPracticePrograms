package IOBasicsDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InputAndOutputStreamReaderWriter {
	
	public static void main(String args[]) throws IOException
	{
		FileOutputStream Fr = new FileOutputStream(System.getProperty("user.dir") + "\\Fout2.txt", true);
		OutputStreamWriter Osw = new OutputStreamWriter(Fr);
		Osw.append("This is the six sentence\n");
		Osw.append("This is the seven sentence\n");
		Osw.append("This is the eighth sentence\n");
		Osw.append("This is the ninth sentence\n");
		Osw.append("This is the tenth sentence\n");
		Osw.close();
		Fr.close();
		
		FileInputStream Fd = new FileInputStream(System.getProperty("user.dir") + "\\Fout2.txt");
		InputStreamReader Isr = new InputStreamReader(Fd);
		int i = Isr.read();
		while(i != -1)
		{
			System.out.print((char)i);
		    i = Isr.read();
		}
		Fd.close();
	}

}
