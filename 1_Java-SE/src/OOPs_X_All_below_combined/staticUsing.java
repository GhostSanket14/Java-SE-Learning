package OOPs_X_All_below_combined;

public class staticUsing {
	
	private int age;
	public int weight;
	static private int calculateObjCreated; // I want to calculate how many objects are created. 
									// So i use static as static variable has only 1 copy. Which is shared by every object of that class.
									// static var belongs to class it is created into.
	public staticUsing(int a, int b) { 
		age=a;
		System.out.println("Constructor with age : "+age+" & weight "+weight);
		calculateObjCreated++;
//		System.out.println("No. is : "+calculateObjCreated);
	}	
	
	public static int getObjNum() { // As this function is static, so similar to static variable. it will only have 1 common copy.
		return calculateObjCreated;
	}
	
	// Rules of STATIC .
	public static int GG() {
//		System.out.println(age); // Cannot make a static reference to the non-static. (Static function cant access non static variables).
		return 0;
	}
}