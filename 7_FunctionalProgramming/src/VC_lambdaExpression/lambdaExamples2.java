package VC_lambdaExpression;
import java.util.*;
import java.util.function.Consumer;

import VC_lambdaExpression.*;

public class lambdaExamples2 {  // Other than type 1, 2 and 3 this is another way to use interface.
	
	// Type 6, Lambda with return type.
	// Note- (a)-> return a*2; - Here we dont have to write return type. Compiler can infer that.
	// Type 7. Using helper functions.
	
	public static interface2 helperFunction() {
		return (Age)-> Age*2; // This lambda will re given to interface instance who calls this function.
	}
	
	
	
	public static void main(String args[]) {

		interface2 obj=helperFunction(); // This way we can use helper function to store lambda functions.
		System.out.println(obj.showDoubleAge(12)); // via that object we can call abstract method & pass value if need.

	}
}