package IOBasicsDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputAndOutputStream {
	
	public static void main(String args[]) throws IOException
	{
        FileOutputStream Fout = new FileOutputStream(System.getProperty("user.dir") + "\\Fout.txt");
        BufferedOutputStream Bout = new BufferedOutputStream(Fout);
		
		for(int i = 10; i < 100; i++)
			Bout.write(i);
		
		Fout.close();
		
		FileOutputStream Fout1 = new FileOutputStream(System.getProperty("user.dir") + "\\Fout.txt", true);
		Bout = new BufferedOutputStream(Fout1);
		
		for(int j = 100; j < 200; j++)
			Bout.write(j);
		Bout.close();
		Fout1.close();
		
		FileInputStream Fin = new FileInputStream(System.getProperty("user.dir") + "\\Fout.txt");
		BufferedInputStream Bin = new BufferedInputStream(Fin);
		
		int k;
				while ((k = Bin.read()) != -1)
				{
					System.out.println(k);
				}
				
		Fin.close();
	}

}
