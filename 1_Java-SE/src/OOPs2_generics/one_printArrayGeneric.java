package OOPs2_generics;

public class one_printArrayGeneric {

	public static<T> void printArray(T ary[]) { // generic function will recognise data type automatically.
		for(int i=0;i<ary.length;i++) {
			System.out.println(ary[i]);
		}
	}
	
	public static void main(String args[]) {
		
		Integer a[]=new Integer[10];
		
		for(int i=0;i<10;i++) {
			a[i]=i+1;
		}
		
		printArray(a);
		
	}
	
}
