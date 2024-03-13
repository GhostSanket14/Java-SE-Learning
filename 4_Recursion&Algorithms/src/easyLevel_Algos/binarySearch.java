package easyLevel_Algos;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,22,32,42,52,62};
		int low=0, high=arr.length, mid=(low+high)/2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter element to be searched:");
		int N=sc.nextInt();
		
		while(low<=high){
			mid=low+(high-low)/2;

			if(arr[mid]==N) {
				System.out.println("Element index is:"+mid);
				break;
			}
			if(N>arr[mid]){ // My mistake, i always compare index rather than element. 
				low=mid+1; // So keep in mind. Compare array element at that index. Ie arr[mid].
			}
			if(N<arr[mid]){
				high=mid-1;
			}
		}
		System.out.println("Its over ");
	}
}