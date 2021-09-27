package CollectionsPractice;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapComparator {
	
	public static void main(String args[])
	{
		TreeMap<Student, Integer> ts = new TreeMap<Student, Integer>(new Student("Abhi", 1, "DPS"));
		ts.put(new Student("Abhi", 2, "DPS"), new Integer("1"));
		ts.put(new Student("Yak", 2, "DPS"), new Integer("3"));
		ts.put(new Student("Zak", 2, "DPS"), new Integer("2"));
		ts.put(new Student("Rock", 2, "DPS"), new Integer("4"));
		
		for(Entry<Student, Integer> s1: ts.entrySet())
			System.out.println(s1.getValue() + " " + s1.getKey().name + " " + s1.getKey().age + " " + s1.getKey().school);
	}

}
