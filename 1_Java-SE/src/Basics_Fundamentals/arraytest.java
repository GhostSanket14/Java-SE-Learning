package Basics_Fundamentals;

public class arraytest {
	
	public static void modify(int[] a) {
		for(int i=0; i<a.length; i++) {
			a[i] = a[i]+1;
		}
	}
	
	public void change(int[] b) {
		for(int i=0; i<b.length; i++) {
			b[i] = b[i]+1;
		}
	}

	public static void main(String[] args) {
	
		arraytest obj= new arraytest();
		int[] arr= {1,2,3};
		
		for(int a : arr) {
			System.out.print("arr "+a+" \t");
		}
		
		System.out.println();
		arraytest.modify(arr);
		for(int a : arr) {
			System.out.print("arr "+a+ "\t");
		}
		
		System.out.println();
		obj.change(arr);
		for(int a : arr) {
			System.out.print("arr "+a+" \t");
		}
	}
}