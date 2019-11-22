package LegacyCollections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String args[]) throws IOException
	{
		Properties prop = new Properties();
		
		prop.put("Sample1", "value1");
		prop.put("Sample2", "value2");
		prop.put("Sample3", "value3");
		prop.put("Sample4", "value4");
		
		FileOutputStream Fout = new FileOutputStream(System.getProperty("user.dir") + "\\Sample.properties");
		prop.store(Fout, "Sample comments");
		
		FileInputStream Fin = new FileInputStream(System.getProperty("user.dir") + "\\Sample.properties");
		prop.load(Fin);
		
		Enumeration<Object> enu = prop.keys();
		
		while(enu.hasMoreElements())
		      System.out.println(prop.getProperty((String) enu.nextElement()));		
	}
	
}
