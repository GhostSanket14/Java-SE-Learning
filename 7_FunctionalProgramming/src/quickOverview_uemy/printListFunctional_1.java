package quickOverview_uemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class printListFunctional_1 { // Number at end indicate code belonging with each-other.

	private static void printListFunctional(List<Integer> nums) {
		// Lets understand step by step.
		
		nums.stream().forEach(printListFunctional_1::print);
		
		
		// STEP1- nums.stream() <- This will convert the List into stream of data.
		// STEP2- .forEach() <- This will run for each element in data stream.
		// STEP3- printListFunctional_1::print <- this is called method reference. Where we use class to call a method.
		// .forEach(printListFunctional_1::print); <- basically means forEach will call the print method via " printListFunctional_1 " for each element in stream.
	}
	
	public static void print(int pasedVal) {
		System.out.println(pasedVal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=new ArrayList<>();
		nums=List.of(1,2,3,4,5,6);	
		printListFunctional(nums);
	}
}