package IOBasicsDemo;

import java.io.File;
import java.io.FileFilter;

class simple implements FileFilter
{

	public boolean accept(File pathname) {
		
		return pathname.isFile();
	}
	
}

public class FileNameFilterDemo {
	
	public static void main(String args[])
	{
		File f1 = new File("C:\\");
		FileFilter filter = new simple();
		File[] f = f1.listFiles(filter);
		for(int i = 0; i < f.length; i++)
		{
			System.out.println(f[i].getName());
		}
		
	}

}
