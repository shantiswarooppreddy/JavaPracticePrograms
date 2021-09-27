package IOBasicsDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileInputOutputReader {
	
	public static void main(String args[]) throws IOException
	{
		FileWriter Fr = new FileWriter(System.getProperty("user.dir") + "\\Fout2.txt", true);
		BufferedWriter Bw = new BufferedWriter(Fr);
		Bw.append("This is the six sentence\n");
		Bw.append("This is the seven sentence\n");
		Bw.append("This is the eighth sentence\n");
		Bw.append("This is the ninth sentence\n");
		Bw.append("This is the tenth sentence\n");
		Bw.close();
		Fr.close();
		
		FileReader Fd = new FileReader(System.getProperty("user.dir") + "\\Fout2.txt");
		BufferedReader Br = new BufferedReader(Fd);
		String i = Br.readLine();
		while(i != null)
		{
			System.out.println(i);
		    i = Br.readLine();
		}
		Fd.close();
	}

}
