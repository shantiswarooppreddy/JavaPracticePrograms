package CollectionsPractice;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator{
	String name;
	int age;
	String school;
	
	Student(String name, int age, String school)
	{
		this.name = name;
		this.age = age;
		this.school = school;
	}
	
	public int compareTo(Student Obj)
	{
		return(this.name.compareTo(Obj.name));
	}

	public int compare(Object o1, Object o2) {
         Student stu1 = (Student)o1;
         Student stu2 = (Student)o2;
         return(stu2.name.compareTo(stu1.name));		
	}
	
}
