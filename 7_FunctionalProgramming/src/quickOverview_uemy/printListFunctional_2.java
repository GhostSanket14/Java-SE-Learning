package quickOverview_uemy;

import java.util.ArrayList;
import java.util.List;

public class printListFunctional_2 { // Number at end indicate code belonging with each-other.

	private static void printListFunctional(List<Integer> nums) {
		nums.stream().forEach(System.out::println); // System.out has 'println' as inbuilt function so we will use it instead of making our
		// or we can simply use a lambda ()-> syso();   etc.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<>();
		nums=List.of(1,2,3,4,5,6);	
		printListFunctional(nums);
	}
}