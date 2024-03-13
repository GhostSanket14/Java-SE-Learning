package streamInJava;

import java.util.Arrays;

public class ex1_sumOfArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4};
		
		System.out.println((float)(int)Arrays.stream(arr).filter(x-> x%2==0).count());
		
		int sum=Arrays.stream(arr).sum(); // .sum() give the sum.
		
		System.out.println(sum);
		
		int max1=Arrays.stream(arr).max().getAsInt(); // we have to getASInt after max()
			// getAsDouble() after average() . and so on.
	}
}