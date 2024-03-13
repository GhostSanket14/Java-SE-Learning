package set_interface;
import java.util.*;


public class treeSet { // function from HashSet works the same here.

	public static void main(String[] args) {
// TreeSet is implementation of red-black tree (self-balancing BST). It maintains 'Increasing' order via comparator interface.
// Either there has to be inbuilt comparator for we have to make it.

// TreeSet
// When one needs to perform read/write operations frequently.
// Also for stuff like like ceil(), floor(), higher(), lower(), we need to use a TreeSet.
// TreeSet can also implement doubly ended queue and doubly ended priority queue for inserting or extracting max-min elements simultaneously.
// TreeSet is more memory efficient as HashSet spread data all over the memory.	

// Methods unique and useful for TreeSet().
		
		TreeSet<Integer> myTSet=new TreeSet<>();
		myTSet.add(2);
		myTSet.add(3);
		myTSet.add(4);
		myTSet.add(1);
		myTSet.add(5);
		myTSet.add(6);

		
		
		// [1] lower() , floor() - null if fail
		System.out.println(myTSet.lower(3)); // gives greatest element, which is lower than given value.
		// Lower than me, but higher than rest.
		// floor - Lower/equal-to me, but higher than rest.

		// [2] higher() , ceiling() - null if fail
		System.out.println(myTSet.higher(3)); // gives lowest element, which is higher than given value.
		// Higher than me but lower than rest.
		// ceiling - Higher/equal-to me, but lower than rest.
		
		
		// [3] first() , last()    It is a BST lower to higher as we go down.
		System.out.println(myTSet.first()); // as per internal arrangement of TS, it gives first element.
		System.out.println(myTSet.last()); // as per internal arrangement of TS, it gives last element.
			
		// [4] headSet() 
		System.out.println(myTSet.headSet(4)); // Gives all values lower them given value.(dokya chya khali).
		System.out.println(myTSet.tailSet(4)); // Gives all values higher/equal-to given value.(tail pasun varti).
		
		TreeSet<Integer> savingSet=(TreeSet<Integer>)myTSet.headSet(4); // we can save them like this.
		
	}
}