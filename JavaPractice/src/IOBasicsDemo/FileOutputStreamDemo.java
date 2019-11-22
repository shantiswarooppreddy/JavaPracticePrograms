package IOBasicsDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	
	public static void main(String args[]) throws IOException
	{
		FileOutputStream Fout = new FileOutputStream(System.getProperty("user.dir") + "\\Fout.txt");
		
		for(int i = 10; i < 100; i++)
			Fout.write(i);
		
		Fout.close();
		
		FileOutputStream Fout1 = new FileOutputStream(System.getProperty("user.dir") + "\\Fout.txt");
		
		for(int j = 100; j < 200; j++)
			Fout1.write(j);
		
		FileInputStream Fin = new FileInputStream(System.getProperty("user.dir") + "\\Fout.txt");
		int k;
				while ((k = Fin.read()) != -1)
				{
					System.out.print((char)k);
				}
	}

}
