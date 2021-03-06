package CollectionsPractice;

import java.util.LinkedList;
import java.util.ListIterator;

class LinkedListDemo {
public static void main(String args[]) {
// Create a linked list.
LinkedList<String> ll = new LinkedList<String>();
// Add elements to the linked list.
ll.add("F");
ll.add("B");
ll.add("D");
ll.add("E");
ll.add("C");
ll.addLast("Z");
ll.addFirst("A");
ll.add(1, "A2");
System.out.println("Original contents of ll: " + ll);
// Remove elements from the linked list.
ll.remove("F");
ll.remove(2);
System.out.println("Contents of ll after deletion: "+ ll);
// Remove first and last elements.
ll.removeFirst();
ll.add(5, "b");
System.out.println("ll after deleting first and last: "+ ll);

String val = ll.get(2);
ll.set(2, val + " Changed");
System.out.println("ll after change: " + ll);
ListIterator<String> Li = ll.listIterator();
while(Li.hasNext())
	System.out.println(Li.next());
}
}