package OOPs1_final;

public class staticKeyword {
	
	private int age;
	public int weight;
	static private int calculateObjCreated; // I want to calculate how many objects are created. 
									// So i use static, as static variable has only 1 copy. Which is shared by every object of that class.
									// static var belongs to class it is created into.
	public staticKeyword(int a, int b) { 
		age=a;
		weight=b;
		System.out.println("Constructor with age : "+age+" & weight "+weight);
		calculateObjCreated++;
//		System.out.println("No. is : "+calculateObjCreated);
	}	
	
	public static int getObjNum() { // As this function is static, it will only have 1 common copy.
		return calculateObjCreated;
	}
	
	// Rules of STATIC .
	int sRule1=1;
	static int sRule2=2;
		
	public static void staticRules() {
//	System.out.println(sRule1); // not allowed.
	// Cannot make a static reference to the non-static. (Static function cant access non static variables).	
    System.out.println(sRule2); // allowed.	
	}
// but non Static function can access both static and non-static variable.
	public void staticRules2() {
		System.out.println(sRule1);
		System.out.println(sRule2);
	}
	
	
	static final int myAge; 
	static int x;
	
	static{ // We can use static block to assign values to static variable. Or we can use constructor as well.
		myAge=21; // we can also use static block to initialize final values if they are static also.
		sRule2=22;
		x=10;
	}
	// Keep in mind. Order of execution,  static block-->main method-->Constructor.
	
}