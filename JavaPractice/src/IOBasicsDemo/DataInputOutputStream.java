package IOBasicsDemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream {
	
	public static void main(String args[]) throws IOException
	{
		FileOutputStream Fout = new FileOutputStream(System.getProperty("user.dir") + "\\Fout.txt");
        DataOutputStream Dout = new DataOutputStream(Fout);
        Dout.writeChars("This is a sample Sentence");
        Dout.flush();
        Dout.close();
        Fout.close();
        
        FileInputStream Fin = new FileInputStream(System.getProperty("user.dir") + "\\Fout.txt");
		DataInputStream Din = new DataInputStream(Fin);
		
		int bytesAvailable = Din.available();
		
		byte[] k = new byte[bytesAvailable];
		Din.readFully(k);
				
		System.out.print(new String(k));
				
		Fin.close();
        
	}

}
