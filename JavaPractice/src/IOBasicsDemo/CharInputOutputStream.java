package IOBasicsDemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CharInputOutputStream {
	
	public static void main(String args[]) throws IOException
	{
		char[] inputCharArray = {65, 66, 67, 68};
		CharArrayReader Cin = new CharArrayReader(inputCharArray);
		int i;
		
		while((i = Cin.read()) != -1)
			System.out.println((char)i);
		
		CharArrayWriter Cout = new CharArrayWriter();
		Cout.write(inputCharArray);
		FileWriter Fout = new FileWriter(System.getProperty("user.dir") + "\\Fout2.txt");
		Cout.writeTo(Fout);
		
		Fout.close();
		Cin.close();
		Cout.close();
		
		
	}

}
