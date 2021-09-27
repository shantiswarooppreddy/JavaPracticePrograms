package CollectionsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String args[])
	{
		TreeMap<String, String> Tm = new TreeMap<String, String>();
		
		Tm.put("Things","Ball");
		Tm.put("Birds","Eagle");
		Tm.put("Animals","Dog");
		Tm.put("Plants","Neem");
		
		Set<Entry<String, String>> es = Tm.entrySet();
	    Iterator<Entry<String, String>> it = es.iterator();
	    Entry<String, String> entry = null;
	    while(it.hasNext())
	    {
	    	entry = it.next();
	    	System.out.println(entry.getKey() + " " + entry.getValue());
	    }
	}

}
