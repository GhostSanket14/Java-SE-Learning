package RecursionLevel1;

import java.util.*;

public class sumofDigitInNum {

	public static int practo(int N) {
		if(N==0) {
			return 0; 
		}
		int tmp=N%10;
		N=N/10;
		return tmp+practo(N);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		System.out.println("ANS="+practo(val));
	}
}