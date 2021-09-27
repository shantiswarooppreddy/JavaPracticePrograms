package Java8Features;

import java.util.StringJoiner;

public class StringJoiners {
	
	public static void main(String args[])
	{
		StringJoiner listOfWords = new StringJoiner(",","[","]");
		StringJoiner listOfWords1 = new StringJoiner(":","{","}");
		
		listOfWords.setEmptyValue("List1 is empty");
		listOfWords1.setEmptyValue("List2 is empty");
		
		System.out.println(listOfWords + " " + listOfWords1);
		listOfWords.add("One"); listOfWords.add("Two"); listOfWords.add("Three"); listOfWords.add("Four");
		listOfWords1.add("Five"); listOfWords1.add("Six"); listOfWords1.add("Seven"); listOfWords1.add("Eight");
		
		System.out.println(listOfWords + " " + listOfWords1);
		System.out.println(listOfWords.length() + " " + listOfWords1.length());
		System.out.println(listOfWords.merge(listOfWords1));
		
	}

}
