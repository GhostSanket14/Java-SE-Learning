package quickOverview_uemy;

import java.util.ArrayList;
import java.util.List;

public class printListFunctional_Mapper_5 {

	// Concept of mapper
	private static void printSquares(List<Integer> nums) {
		nums.stream()
		.map(num -> num*num) // This is how we map a value to a another value (function/lambda).
		.forEach(System.out::println); // receive from .stream(), will be processed .map()
	}	// map basically uses a lambda expression. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<>();
		nums=List.of(1,2,3,4,5,6,7,8,10);	
		printSquares(nums);
	}
}