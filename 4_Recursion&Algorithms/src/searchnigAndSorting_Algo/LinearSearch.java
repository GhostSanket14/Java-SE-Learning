package searchnigAndSorting_Algo;

public class LinearSearch {

	
	public int linearSearch(int passedArr[], int value) { 
		int index=0;
		
		for( int val : passedArr) {
			index++;
			if(val==value) {
				return index;
			}
		}		
		return index;
	}
		
	public static void main(String[] args) {
		LinearSearch ls=new LinearSearch();
		int arr[]= {8,4,5,3,1,6,9,75,1,2,60}, val=8;
		System.out.println("Value is found at index: "+ls.linearSearch(arr, val));
	}
}