package RecursionLevel1;

import java.util.Scanner;

public class fibonacciNumber {

	public static int fiboBhai(int val) { // This code will calculate the nth fibo. number.
		if(val==0) {
		return 0;
		}
		if(val==1) {
			return 1;
		}
		int SA=fiboBhai(val-1)+fiboBhai(val-2); // We are going n to 0 for calculations. 
		return SA; // Fist + second , Here after First reaches its end. Then only second will begin.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		System.out.println(fiboBhai(val));
	}
}