package methodReference;

import java.util.ArrayList;
import java.util.List;

public class methodReference {

	// A functional interface is an interface that contains only one abstract method.
	// Method reference is used to refer method of functional interface. (basically alternative to lambda expression)
	// Using MR we can refer to static method, instance method and constructor.
	
	private static void printListFunctional(List<Integer> nums) {
		nums.stream().forEach(methodReference::print);
		// printListFunctional_1::print <- this is called method reference. Where we use class to call a method.
	}
	public static void print(int pasedVal) {
		System.out.print(pasedVal+" ");
	}
	
	// using method reference we can also pass a received input to a function.
	private void printListMethodR(List<Integer> nums) {
		nums.stream()
		.forEach(this::printNew); // methods referencing require number and order of parameters to match. so use this carefully.
		// OR
//		nums.stream()
//		.forEach((x)->printNew(x));  // use this to pass more robust parameters.
	}
	public void printNew(int pasedVal) {
		System.out.print(pasedVal+" ");
	}
	
	public static void main(String[] args) {
		methodReference obj=new methodReference();
		List<Integer> nums=new ArrayList<>();
		nums=List.of(1,2,3,4,5,6);	
		printListFunctional(nums);
		System.out.println();
		obj.printListMethodR(nums);
	}
}