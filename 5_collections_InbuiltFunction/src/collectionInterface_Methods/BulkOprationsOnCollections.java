package collectionInterface_Methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class BulkOprationsOnCollections {


	public static void main(String[] args) {

	// [] BULK Operations []
	// These are bulk operations of Collection interface. (we can use them among same or different type of collections.)
	// There maybe few collections which may not work together. i will write below as i encounter them. 
	// Keep in mind all of these operations modify the original list/ collection.
	// They also return true/false based of successful/unsuccessful operation.
		
		List<Integer> al1=new ArrayList<>();
//		LinkedList<Integer> al1=new LinkedList<>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		
		List<Integer> al2=new ArrayList<>();
//		LinkedList<Integer> al2=new LinkedList<>();
		al2.add(1);
		al2.add(3);
		
		
		HashSet<Integer> x=new HashSet<>();
		x.add(1);
		x.add(4);
		
		// containsAll(); checks if all elements from list-2 are present in list-1
				System.out.println("containsAll "+al1.containsAll(al2));
				// containsAll(); checks if all methods from set are present in list.
				System.out.println(al1.containsAll(x));
				
				// addAll(); all elements from list2 will be added to list1. (yes duplicate values).
				al1.addAll(al2);
				System.out.println("addAll "+al1);
				
				// removeAll(); all elements from list1 which match with list2 elements will be removed.
				al1.removeAll(al2);
				System.out.println("removeAll "+al1);
				
				// retainAll(); all elements from list1 which match with list2 elements will be Kept. rest will be removed.
				al1.retainAll(al2);
				System.out.println("retainAll "+al1);
				
				al1.clear(); // Ignore these.
				al2.clear();
				
				al1.add(1);
				al1.add(2);
				al1.add(3);
				al2.add(1);
				al2.add(1);
				al2.add(5);		

		
		al1.removeIf((n)-> (n%2==0)); // removed based on predicate.
		System.out.println("Predicate based removal "+al1);
		
	}
}