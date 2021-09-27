package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	
	@SuppressWarnings("unchecked")
	public static void main(String args[])
	{
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Abhi", 13, "DPS"));
		list.add(new Student("Zak", 12, "DPS"));
		list.add(new Student("Yoki", 11, "DPS"));
		list.add(new Student("Rob", 10, "DPS"));
		list.add(new Student("Bob", 23, "DPS"));
		
		Collections.sort(list);
		
		for(Student s1: list)
			System.out.println(s1.name + " " + s1.age + " " + s1.school);
		
		Collections.sort(list, new Student("Abhiram", 15, "DPS"));
		
		for(Student s1: list)
			System.out.println(s1.name + " " + s1.age + " " + s1.school);
	}

}
