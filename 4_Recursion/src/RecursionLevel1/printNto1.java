package RecursionLevel1;

import java.util.*;

public class printNto1 {

	public static void printN(int N) {
		if(N==0) {
			return; // we can use this return in case of void. 
		}
		System.out.println(N); // This will print N to 1
		printN(N-1);
	}
	
	public static void print1ToN(int N) {
		if(N==0) {
			return;
		}
		print1ToN(N-1);
		System.out.println(N); // This will print 1 to N
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		printNto1 Obj=new printNto1();
		Obj.printN(N);
		System.out.println();
		Obj.print1ToN(N);
	}
}