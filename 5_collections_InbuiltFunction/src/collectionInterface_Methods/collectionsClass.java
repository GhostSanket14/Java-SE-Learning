package collectionInterface_Methods;

import java.util.*;


public class collectionsClass { // Collection Methods: These are applied to things implementing collection interface.
// Collections class, All methods in this are static.
// Some of Collections.___ are meant only for list interface. Keep that in mind.
	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(2);
		al.add(2);
		
		LinkedList<Integer> al2=new LinkedList<>();
		al2.add(1);
		al2.add(2);
		al2.add(3);
		al2.add(4);
		
		Collections.swap(al2, 0, 3); // Both are index. no end exclusive here.
		System.out.println(al2);
		
		// min() max()
		System.out.println(Collections.min(al));
		System.out.println(Collections.max(al2));
		
		// Collections.sort() - For non-primitive types and List interface, it uses  merge Sort algo.
		// C.sort() is Stable sort- (it is a sorting algorithm that maintain relative order of output of elements as input)
		// Note- We can pass comparable interface only for non-primitive data types.
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
		// disjoint() frequency()
		System.out.println(Collections.disjoint(al, al2)); // returns true if two collections have no common elements.
		System.out.println(Collections.frequency(al, 2)); // To find frequency of element.
		
		// To replace value with new value.
		Collections.replaceAll(al2, 1, 8);
		
		Collections.reverse(al2);
		
		
		
		int key=5;
		System.out.println("Key found at "+Collections.binarySearch(al, key)); // To perform a binary search.
		// Return of binarySearch() if value is not found is, - insertion point+1
		// binarySearch( data_type[] arr, int fromIndex, int toIndex, data_type key ) <- we can search in a range too.
		
	}
}