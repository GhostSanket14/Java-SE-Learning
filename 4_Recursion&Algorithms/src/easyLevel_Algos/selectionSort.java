package easyLevel_Algos;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,9,7,6,1,3,4};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}		
		}		
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}				
	}
}