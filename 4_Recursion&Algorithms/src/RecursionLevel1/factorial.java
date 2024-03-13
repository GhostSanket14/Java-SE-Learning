package RecursionLevel1;

import java.util.Scanner;

public class factorial {

	public static int FactorialLogic1(int n) {
		if(n==1) {
			return 1; 
		}
		int smallAns=FactorialLogic1(n-1);
		return n*smallAns;
	}
	
	public static int FactorialLogic2(int N) { 
		if(N==1) {
			return N; 
		}
		int ans=0;
		ans=N*FactorialLogic2(N-1);
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int input=sc.nextInt();
		
		System.out.println("Factorial Logic 1 "+FactorialLogic1(input));
		System.out.println("Factorial Logic 2 "+FactorialLogic2(input));
	}
}