package IOBasicsDemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteInputAndOutputStream {
	
	public static void main(String args[]) throws IOException
	{
		byte[] inputByteArray = {65, 66, 67, 68};
		ByteArrayInputStream Bin = new ByteArrayInputStream(inputByteArray);
		int i;
		
		while((i = Bin.read()) != -1)
			System.out.println((char)i);
		
		ByteArrayOutputStream Bout = new ByteArrayOutputStream();
		Bout.write(inputByteArray);
		FileOutputStream Fout = new FileOutputStream(System.getProperty("user.dir") + "\\Fout2.txt");
		Bout.writeTo(Fout);
		
		Fout.close();
		Bin.close();
		Bout.close();
		
		
	}
 
}
