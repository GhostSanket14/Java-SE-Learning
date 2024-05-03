package RecursionLevel1;

import java.util.*;

public class productofDigitInNum {

	public static int practo(int N) {
		if(N==0) {
			return 1; 
		}
		int tmp=N%10;
		N=N/10;
		return tmp*practo(N);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		System.out.println(practo(val));
	}
}