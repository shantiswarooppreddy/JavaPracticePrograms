package IOBasicsDemo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.PushbackReader;

public class PushBack {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream Fin = new FileInputStream(System.getProperty("user.dir") + "\\Fout2.txt");
		PushbackInputStream Pin = new PushbackInputStream(Fin);
		int i;
		while((i = Pin.read()) != -1)
			if((char)i != ' ')
			System.out.println((char)i);
			else
			Pin.unread(56);
		Pin.close();
		Fin.close();
		
		FileReader Fr = new FileReader(System.getProperty("user.dir") + "\\Fout2.txt");
		PushbackReader Pr = new PushbackReader(Fr);
		while((i = Pr.read()) != -1)
			if((char)i != ' ')
				System.out.println((char)i);
			else
				Pr.unread(56);
		Pr.close();
		Fr.close(); 
	}

}
