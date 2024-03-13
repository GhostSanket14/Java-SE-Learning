package quickOverview_uemy;

import java.util.*;
import java.util.function.Predicate;

public class predicateAndOptionalClass_6 {

	// Optional is created to 
	public static void main(String[] args) {

		List<String> fruits=new ArrayList<>();
		fruits=List.of("Apple","Orange","Banana","Boba fruit");
		
		// predicate means a statement that determines whether a value could be true or false.
		Predicate<? super String> predicate = fruit-> fruit.startsWith("B");
		fruits.stream().forEach(System.out::println);
		fruits.stream().filter(predicate).findFirst(); // Using find first method. To only get first value from stream.
		
		// We are storing the output in Optional class because fruit starting with "B" may or may not exist.
		// Optional 'object' can either contain a non-null value (in which case it is considered present) 
		// or it can contain no value at all (in which case it is considered empty).
		
		Optional<String> findFirstOptional = fruits.stream().filter(predicate).findFirst();
		System.out.println(findFirstOptional); // If there is nothing this will not give 'null' it will give 'optional.empty'
		System.out.println(findFirstOptional.isEmpty());
		System.out.println(findFirstOptional.isEmpty());
		System.out.println(findFirstOptional.get());
		// It is advice'd to go with optional if there is chance that your output may be empty.
		
		// Making optional.
		Optional<String> op1=Optional.of("A");
		Optional<String> op2=Optional.empty(); // Making a optional empty.
		
		// Basically we use Optional instead of null to represent empty values. IMP 
		
		
		
		
	}
}