package LegacyCollections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {
	
	public static void main(String args[])
	{
		Hashtable<String, Double> hm = new Hashtable<String, Double>();
		
		hm.put("Sample1", new Double(9.000));
		hm.put("Sample2", new Double(7.000));
		hm.put("Sample3", new Double(9.100));
		hm.put("Sample4", new Double(5.000));
		
		Enumeration<String> vKeys = hm.keys();
		
		while(vKeys.hasMoreElements())
		   System.out.println(hm.get(vKeys.nextElement()));
		
		Set<Entry<String, Double>> s = hm.entrySet();
		
		for(Entry<String,Double> e: s)
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
			
	}

}
