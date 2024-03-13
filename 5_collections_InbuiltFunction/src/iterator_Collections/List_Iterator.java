package iterator_Collections;
import java.util.*;
import java.util.Iterator;

public class List_Iterator {

	public static void main(String[] args) {
				
		// List-iterator interface.
		List<String> names2=new ArrayList<>(); // Default size is 10, is incremented by 1.5 times.
		names2.add("Sanket");
		names2.add("Ghost");
		names2.add("Varsha");
		names2.add("Cynide");
		names2.add("Bun");
		
		// We can also use ListIterator for List-collections.
		ListIterator<String> itr1= names2.listIterator(names2.size());  // Size is parameter, where the iterator to point.
		
		// Its benefit is that it gives reverse traverse ability. And few more functions.
		while(itr1.hasPrevious()) { 
			System.out.println(itr1.previous());
		}
// 		remove() - to remove.
//		hasPrevious() - It is used to check if we have previous item for the item pointed by current iterator or not.
//		previous() - It returns the previous element of the list, and moves the iterator one position back.
//		add() - It is used to add an item while iterating through the List.
//		set() - replaces the element returned by either next() or previous() with the specified element
//		nextIndex() returns the index of the element that the next() method will return
//		previousIndex() - returns the index of the element that the previous() method will return	
	}
}