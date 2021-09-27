package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	String bookName;
	String Subject;
	
	Library(String bookName, String Subject)
	{
		this.bookName = bookName;
		this.Subject = Subject;
	}
	
	public static void main(String args[])
	{
		List<Library> listOfBooks = new ArrayList<Library>();
		listOfBooks.add(new Library("Resnick and Halliday", "Physics"));
		listOfBooks.add(new Library("Radio Wave", "Physics"));
		listOfBooks.add(new Library("Organic Chemistry","Chemistry"));
		
		listOfBooks.forEach(
			(book) -> 
			{
				if(book.Subject.equals("Physics"))
				   System.out.println(book.bookName);
			}
		);
		List<String> list = new ArrayList<String>();
		list.add("Fundamentals of Physics");
		list.add("Concepts of Physics");
		list.add("Fundamentals of AstroPhysics");
		
		list.forEach(
			 (bookname) ->   
			 {
			   if(bookname.contains("Physics"))
				   System.out.println(bookname);
			 }                
		);
	}

}
