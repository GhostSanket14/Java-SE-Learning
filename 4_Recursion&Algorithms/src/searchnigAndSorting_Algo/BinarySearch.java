package searchnigAndSorting_Algo;

public class BinarySearch {

	
	public int binarySearch(int arr[], int val) {
		int start=0, end=arr.length-1, mid=(start+end)/2, index=0;
		
		while(start<=end) {
			if(arr[mid]==val) {
				return mid;
			} // Sanket here we use IF and IF-ELSE, & not single nested if-else
			
			else if(val>arr[mid]) {
				start=mid+1;
			}else {
				end=mid-1;
			}
			mid=(start+end)/2;
		}
		return -1;
	}
	
	
	public static void main(String args[]) {
		BinarySearch bs=new BinarySearch();
		int arr[]= {10,11,12,13,14,15,16};
		int val= 16;
		System.out.println(bs.binarySearch(arr, val));
	}	
}