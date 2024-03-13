package quickOverview_uemy;
import java.util.*;

public class printListStructured_1 {
	
	// This is show how we normally/structuredly do a java task.

	private static void printListIteratively(List<Integer> nums) {
		for(int num:nums) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<>();
		nums.add(10); // This is first way to add elements to list.
		nums.add(20);
		nums=List.of(1,2,3); // This is second way to add items to list.
		
		printListIteratively(nums);
	}
}