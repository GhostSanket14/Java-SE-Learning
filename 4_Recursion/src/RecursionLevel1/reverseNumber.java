package RecursionLevel1;

import java.util.*;

public class reverseNumber {

	static int sum=0; // We can also use a global value with recursion. So no need to return now. but its weak mans sign :(
	
	public static int practo(int N) { 
		if(N==0) {
			return sum;
		}

		int last=N%10;
		sum=sum*10+last;
		practo(N/10);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		System.out.println(practo(val));
	}
}