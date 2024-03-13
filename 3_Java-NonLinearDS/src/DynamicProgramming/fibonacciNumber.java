package DynamicProgramming;

import java.util.*;

public class fibonacciNumber {

	public static int fiboNormal(int N) {
		if(N==0) {
			return 0;
		}
		if(N==1) {
			return 1;
		}
		int n=fiboNormal(N-1)+fiboNormal(N-2);
		return n;
	}
	
	private static int fiboDP(int N, int[] arr) {
		if(N==0) {
			return 0;
		}
		if(N==1) {
			return 1;
		}
		int left, right; // this ans will come from either array or by calling below.
		// this toggle condition will decide that.
		if(arr[N-1]==-1) { // we will check 1 behind the array. as thats the index we are about to call to get the fibo number.
			left=fiboDP(N-1,arr); 
			arr[N-1]=left; // Finally we have to store the answer.
		}else { // if array index is not -1. It means that call has already been made, and we will just take ans from array.
			left=arr[N-1];	
		}
		if(arr[N-2]==-1) {
			right=fiboDP(N-2,arr);
			arr[N-2]=right;
		}else {
			right=arr[N-2];	
		}
		return left+right;
	}
	

	private static int fiboDPIterative(int num) {
		
		if(num==0) { // we learn't this base case.
			return 0;
		}
		if(num==1) {
			return 1;
		}
		int[] dpArray=new int[num+1];
		dpArray[0]=0;
		dpArray[1]=1;
		for(int i=2; i<num+1; i++) {
			dpArray[i]=dpArray[i-1]+dpArray[i-2]; // And this is our recurrence relation.
		}
		
		return dpArray[num]; // we will get the last index as our answer.
		
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int dpArray[]=new int[num+1]; // we will use this array to store the answer to calls.
		Arrays.fill(dpArray, -1);
		
		System.out.println(num+"th Fibo Number (Normal) : "+fiboNormal(num));

		System.out.println(num+"th Fibo Number (DP) : "+fiboDP(num, dpArray));
		
		System.out.println(num+"th Fibo Number (Iterative DP) : "+fiboDPIterative(num));
    
	}

}