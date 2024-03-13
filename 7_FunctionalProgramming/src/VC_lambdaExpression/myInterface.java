package VC_lambdaExpression;

@FunctionalInterface // This way we can create a functional interface.
public interface myInterface { // Functional Interface have only 1 abstract method of its own (ie. non-overriding). (keep in mind OWN)
	
	// there can be abstract functions of other interfaces. Eg- equals from object class. 
	
	public void show(String name); // this is abstarct.
	
	default void sayHelo1() {
		System.out.println("Hi 1");
	}
	static void sayHelo2() {
		System.out.println("Hi 2");
	}
	
}
 // It may contain zero or more default or static methods. 