package easyLevel_Algos;

public class bubbleSort {

	public static void main(String[] args) {

		int arr[]= {5,9,7,6,1,3,4};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-(i+1); j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=tmp;
				}
			}
		}

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}