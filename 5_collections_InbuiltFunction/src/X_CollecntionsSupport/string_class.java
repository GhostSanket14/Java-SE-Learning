package X_CollecntionsSupport;

public class string_class {

	public static void main(String args[]) {
	
	// we already know, .charAt() .length() .compareTo() .equals() .contains() .concat() .isEmpty() .substrings
		
		String a="Sankeat";
		String b="Ghost";
		
		System.out.println(a.startsWith("Sa")); // used to check if a string starts with something.
		System.out.println(a.endsWith("Sa")); // used to check if a string ends with something.
		
		System.out.println(a.indexOf('a')); // Gives first occurrence of specified char or string.
		System.out.println(b.indexOf("os"));
		System.out.println(a.indexOf('a',2)); // we can also choose the index to start the search from.
		System.out.println();
		System.out.println(a.lastIndexOf('a')); // Gives last occurrence of specified char or string.
		System.out.println(b.lastIndexOf("os"));
		System.out.println(a.lastIndexOf('a',2)); // we can also choose the index to start the search from.
		
	}
}