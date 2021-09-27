package CollectionsPractice;

import java.util.TreeSet;

public class TreeSetComparator {
	
	public static void main(String args[])
	{
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(new Student("Abhi", 2, "DPS"));
		ts.add(new Student("Barg", 3, "IFS"));
		ts.add(new Student("Zak", 2, "DPS"));
		ts.add(new Student("Yok", 3, "IFS"));
		
		for(Student s1: ts)
			System.out.println(s1.name + " " + s1.age + " " + s1.school);
		
	}

}
