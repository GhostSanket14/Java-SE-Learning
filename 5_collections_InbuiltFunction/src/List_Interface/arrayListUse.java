package List_Interface;

import java.util.*;


public class arrayListUse {

	public static void main(String[] args) {
		
		// ArrayList, can be created to store data of only non-primitive types
		ArrayList<String> names=new ArrayList<>(); // Default size is 10, is incremented by 1.5 times.
		
		// add(val), add(index,val), addAll()
		names.add("Sanket"); // add()- to add element. New element is added at the end.
		names.add("Ghost");
		names.add("Ghost");
		System.out.println(names);
		names.add(0,"God"); // We can also add at specific position, using index value. (We insert there, and other elements shift)
		System.out.println(names);
		ArrayList<String> newNames=new ArrayList<>();
		newNames.add("Soap");
		names.addAll(newNames); // We can also concat 2 AL's . or AL and a LL. LL and LL etc. 
		System.out.println(names);
		
		// set()
		names.set(0,"Garuda"); // This updates the value at specified position. Ie. Overrides.
		System.out.println(names);
		
		// get(index) size() and loop traversal method-1.
		// Method 2 we can use for-each loop, method 3 we can also use iterator or ListIterator.
		System.out.println(names.get(1)); // we can get a element at a specific index.
		for(int i=0;i<names.size();i++) { // Size gives no. of elements & not size/length of array.
			System.out.println(names.get(i));
		}
		
		// indexOf() and lastIndexOf()
		System.out.println("indexOf() "+names.indexOf("Ghost")); // very first occurrence of element in list.
		System.out.println("LastIndexOf() "+names.lastIndexOf("Ghost"));// very last occurrence of element in list.
		
		// remove(index) & remove(type.valueOf(value))
		names.remove(1); // We can remove/delete a element using its index.
		names.remove(String.valueOf("Ghost")); // We can also remove element based on its 'type' and 'value' (its object)
		System.out.println(names);
		
		// AL.clear()
		newNames.clear(); // It completely empty out's the Array list.
		System.out.println(newNames); //# OP- empty []
		System.out.println("-"+names.isEmpty()); // To see if its empty.
		// contains()
		System.out.println(names.contains("Garuda")); // It checks if given value is present or not. returns true/false
		
		// Collections.reverse();  	
		Collections.reverse(names);
		System.out.println(names);
		
		// to Sort in Ascending we can use Collections.sort(); OR Collections.sort( ,Collections.reverseOrder())
		Collections.sort(names);
		System.out.println(names);
		
		// toArray();
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		Object arr[]=al.toArray(); // To convert collection to Object array.
		for(Object o: arr) {
			System.out.println(o);
		}
		
		Integer arr1[]=new Integer[al.size()]; // Making wrapper (object) type array from collection. 
		arr1=al.toArray(arr1);
		for(Integer a: arr1) {
			System.out.println(a);
		}		
		// Difference in toArray and aslist is that toArray creates a new array and thus operations on new not affect old array.
		// But what as list method do is it basically converts the primitive array into a wrapper array
		// thus operations will be affecting the original array / original data
				
		
	}
}