package streamInJava;

import java.util.List;

public class basicsOfStream {

	
	public static void main(String[] args) {
	// A pipeline of function which is applied on a source. (source can be array, collecions etc. )
	// There are few function that can be used with streams. Learn them as we come across. 
	// And them in these notes.
		
		List<Integer> al=List.of(1,2,3,4,5,6,7,8,9);
		al.stream().filter((x)-> x>5).filter((x)-> x%2==0).forEach(System.out::println);
		
// 		Advantages-		
//		1. No Storage
//		2. Can be infinite and parallelized.
//		3. They don't change original structure.
// 		4. Each intermediate operation is lazily executed and returns a stream as a result
// Sourse.stream() from here till last function. Every function will take stream as input and stream as output. 
// last function will take stream as input but its output wont be stream. As it is Terminate function.
		
	}
}