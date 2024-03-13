package X_CollecntionsSupport;

import java.util.*;

public class Arrays_Class {

	public static void main(String[] args) {
		
		int no[]={1,2,3,4,5,6,7};
		int no1[]={1,2,3,9,5,6,7};
		int kaiPn[]= {5,9,3,1,6,5,7,9,8,4,63,2};
		String name[]= {"Sanket","Ghost","Bro"};
		
		int key=5;
		System.out.println("Key found at "+Arrays.binarySearch(no, key)); // To perform a binary search.
		// Return of binarySearch() if value is not found is, - insertion point+1
		// binarySearch( data_type[] arr, int fromIndex, int toIndex, data_type key ) <- we can search in a range too.
		
		System.out.println(no.length); // to get array length.
		
		// Arrays.sort used Dual-Pivot-Quick sort 
		Arrays.sort(kaiPn); // To sort a array in ascending order. (Works in both primitive and non-primitive dtypes)
		Arrays.sort(kaiPn, 3, 11); // To sort in specified index. End index is exclusive.
		
		Integer age[]= {21,56,36};
		Arrays.sort(age);
		System.out.println(Arrays.toString(age));
		Arrays.sort(age, Collections.reverseOrder()); // To sort a array in descending order. It works with wrapper only.
		System.out.println(Arrays.toString(age)); // because we are using Collections. here.reverseOrder() here.
		
		System.out.println(Arrays.toString(name)); // To convert array to string.
		
		System.out.println(Arrays.mismatch(no,no1)); // Finds and returns the index of the first unmatched element.
		
		Arrays.fill(no, 14); // To fill entire array with a value.
		System.out.println(Arrays.toString(no));
		
		List ls=Arrays.asList(name); // To convert array to list.
		System.out.println(ls);
		
		int test1[]={1,2,3,4,5,6,7};
		int test2[]={1,2,3,4,5,6,7};
		System.out.println(Arrays.equals(test1, test2)); //  2 arrays are equal if they have same elements in same order
		
		System.out.println(Arrays.compare(test1, test2)); //  It compared lexicographically. and returns
		// 0: if (test1==test2)		-1: if (test1 < test2)			1: if (test1 > test2)
		
		int test3[]=Arrays.copyOf(test1,test1.length); // first parameter is original array, second is No. of elements from original to be copied.
		System.out.println(Arrays.toString(test3));
		
		int test4[]=Arrays.copyOf(test1,4); // first parameter is original array, second is No. of elements from original to be copied.
		System.out.println(Arrays.toString(test4));

	}
}