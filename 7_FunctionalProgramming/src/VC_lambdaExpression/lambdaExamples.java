package VC_lambdaExpression;
import java.util.*;
import java.util.function.Consumer;

import VC_lambdaExpression.*;

public class lambdaExamples { // Also called anonymous function.
// We use lambda to provide the implementation of Functional interface(interfaces with one abstract method) and Less coding.
// It can take parameters and returns value. similar to methods.
// Expressions cannot contain variables, assignments or statements such as if or for.
// More complex operations a code block can be used with curly braces. They also can have return a value.
// They do not need a name and they can be implemented right in the body of a method. (as we did in functional pro)
//	As we dont want to pass any parameters we use empty (), else we can have any number of parameters.
		
	
	// Type 1, Non parameterized lambda.	
	static void nonParameterizedLambda(myInterface_nonParametrized s) {	
		s.show();
	}
	static void ParameterizedLambda(myInterface s, String name) { // This way we can pass parameters.	
		s.show(name);
	}
	
	public static void main(String args[]) {

	// Type 1, using above. Non parameterized lambda
	nonParameterizedLambda(()-> System.out.println("Hello there") );
		
	// Type 2 Example of single parameterized lambda interface.
	List<Integer> ls=new ArrayList<>();
	ls=List.of(1,2,3,4,5);
	ls.forEach((x)-> { System.out.println(x%2==0); } ); // Here we have passed X parameter.
	
	// Type 3, Using functional interface we made.
	ParameterizedLambda((name)->System.out.print(name), "Sanket"); // Using interface and passing values.
	
	// Type 4, Using functional interface we created.
	String nam="ghost"; // Basically reference we created with this interface will store our lambda.
	myInterface miObj= (n) -> System.out.println("Hello guys, "+n);
	miObj.show(nam);
	
	// Type 5, Using Java's Consumer interface to store a lambda expression in a variable:
	Consumer<Integer> cVal=(n)->{ // We can later use this variable.
		n=n*n;
		System.out.println(n);
	};
	ls.forEach(cVal);	
	
}
}