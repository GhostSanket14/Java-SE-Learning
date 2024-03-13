package quickOverview_uemy;

import java.util.ArrayList;
import java.util.List;

public class printListFunctional_Lambda_4 {

	// Concept of Lambda. 
	private static void printEvenFunctional(List<Integer> nums) {
		nums.stream()
		.filter( (num) -> num%2==0 ) // This means for each passed  num from .stream run the ->num%2==0 and return a value.
		.forEach(System.out::println); // and if the value returned by lambda matches with data given to filter. 
								// it runs the further function. We know this already.
	} // We can write lambda expression as, 1. num -> num%2==0
	// Note= we use brackets ie. (num, age), if we have more than one parameters.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<>();
		nums=List.of(1,2,3,4,5,6,7,8,10);	
		printEvenFunctional(nums);		
	}
}