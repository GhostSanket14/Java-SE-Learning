package easyLevel_Algos;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		int arr[]={1,2,6,5,4,7,9,6,};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to be seached :");
		int N=sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==N) {
				System.out.println("Element found at index:"+i);
			}
		}
	}
}