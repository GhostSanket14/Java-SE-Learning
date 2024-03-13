package iterator_Collections;
import java.util.*;
import java.util.Iterator;

public class iterator {
	// 3 methods to iterate. 1. iteraotr() 2. foreach loop. 3. foreach method (with loop, filter, lambda etc.).
	// Iterable is a interface and iteraotr() is the method provided by this interface.
	// This iteraor() method returns a Object than implement iterator interface. And using this object we can perform 
	// following operation.
	
	
	public static void main(String[] args) {
		List<String> names=new ArrayList<>(); // Default size is 10, is incremented by 1.5 times.
		names.add("Sanket");
		names.add("Ghost");
		names.add("Varsha");
		names.add("Cynide");
		names.add("Bun");

		// Here i have linked my array list to iterator object
		Iterator<String> itr= names.iterator(); // used for iteration in Collections	
		

		System.out.println(itr.hasNext()); // checks and returns if there is a value next to current pointer.
		System.out.println(itr.next()); // next moves the pointer to next element. Initially pointer is just before 1st element.
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		itr.remove(); // We use this to remove. (we  use if to remove specific value)
		System.out.println(itr.hasNext()); // false.

//		while(itr.hasNext()) { 
//			System.out.println(itr.next()); // Next basically moves a pointer to next element location from current location.
//		}				// So no matter where u write it. Each next() will affect each other.
//		
//		
//		StringBuffer sb=new StringBuffer();
//		for(String s: names) {
//			sb.append(s);
//		}
//		System.out.println(sb);
		
	}
}