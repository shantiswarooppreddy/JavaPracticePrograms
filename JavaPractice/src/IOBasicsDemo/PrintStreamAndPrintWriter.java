package IOBasicsDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamAndPrintWriter {
	
	public static void main(String args[]) throws IOException
	{
		//PrintStream
		OutputStream Fin = new FileOutputStream(System.getProperty("user.dir") + "\\Fout3.txt");
		PrintStream Pin = new PrintStream(Fin);
		Pin.println("Printing Sample Sentence");
		Pin.close();
		Fin.close();
		
		//PrintWriter
		PrintWriter Pw = new PrintWriter(new File(System.getProperty("user.dir") + "\\Fout4.txt"));
		Pw.println("Printing from PrintWriter");
		Pw.close();
	}

}
