package set_interface;
import java.util.*;

public class hashSetBasic { // we store keys using it.

	public static void main(String[] args) {
		// Set interface does not allow duplicate keys. (Only one copy)
		// we can't access element in random location in set interface.
		// Can store null value, just like HashMap, it too don't follow any order. (HashTable and LinkedHashtable follow order)
		// As it implement hashing and hash-table. 
		// So key we insert in HashSet acts as a key to the map Object and for its value.
		
		// There are other ways to make HS with various constraints. ( Look later if need )
		Set<Integer> hs=new HashSet<>(); // Note- we cant pass element in constructor of hashSet
		hs.add(1); // Add elements and return false if unsuccessful.
		hs.add(2);
		hs.add(1); // This wont be added. And false will be returned.
		hs.add(3);
		hs.add(4);
		
		for(int a:hs) {
			System.out.println(a);
		}
		
		System.out.println("contains "+hs.contains(1)); // To see if elements exist.
		System.out.println("isEmpty "+hs.isEmpty()); // To see if set is empty.
		System.out.println("remove "+hs.remove(1)); // To remove element if elements exist. (returns false if it don't exist).
		// keep in mind, set don't allow use of indexes
		
		System.out.println("size "+hs.size()); // No. of elements.
		
		for(int a:hs) {
			System.out.print(a+" ");
		}
		
		List<Integer> hal=new ArrayList<>(hs);
		for(int a:hal) {
			System.out.print(a+" ");
		}
		hs.clear(); // remove all elements		
				
		// We can use iterator as well.
		// search, insert and delete is o(1)
	}
}