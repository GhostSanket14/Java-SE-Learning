
package quickOverview_uemy;

import java.util.ArrayList;
import java.util.List;

public class printListFunctional_Filter_3 {

	public static boolean isNumEven(int num){ // This will act as our filter.
		return num%2==0;
	}
	
	// Concept of filter. (We can use multiple filters).
	private static void printEvenFunctional(List<Integer> nums) {
		nums.stream()
		.filter(printListFunctional_Filter_3::isNumEven) // This filter will run .forEach only for true return from isNumEven
		.forEach(System.out::println); 
	// Filter dont return true/false. What is does is it. returns the stream that matches with the predicate.
	// Eg- if we sent 2 to filter() then that 2 goes into predicate and if the return from predicate matches the
	// data sent into filter then only filter allows next function to run.
	}	
	
	// Predicate is basically a FunctionalInterface which has a function() which return true or false.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<>();
		nums=List.of(1,2,3,4,5,6,7,8);	
		printEvenFunctional(nums);
	}
}