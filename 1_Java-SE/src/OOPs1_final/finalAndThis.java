package OOPs1_final;

public class finalAndThis {

	final int ID; // Initialize it here or in constructor. 1sy way of initialization.
	int Age=10;   // These values comes under 'this' .
	
	public finalAndThis(int valOfFinal, int Age) { // This is 2nd and preferred way to assign value to final.
		this("Sanket","COD",15); // This can be used to call another constructor.
//		this.ID=valOfFinal;   <- Because we are giving ID its value using above constructor.		
		this.Age=Age; // if i used this.Age=Age value in instance will be updated.
		// In Age=Age we are basically assigning passed value to local variable (which only exists within method).
		System.out.println(Age); // (this will print the value we pass)
		System.out.println(this.Age); // ( this will print value in instance, i.e 10)	
		// this is used to solve the conflict that may occur due to similar names.
		System.out.println("Address of this in constructor : "+this); // This will give address of reference object we created. ie object in main()
		System.out.println("ID final is: "+ID);
	}
	
	//	public finalAndThis(int Age) { // This will give us error as we didnt assign value to ID (final) it is not allowed.
	//		Age=Age;
	//	}
	
	
	public finalAndThis(String name, String game, int IDVal) {
		this.ID=IDVal;
		System.out.println("---------->");
		System.out.println("Name is: "+name);
		System.out.println("Game is: "+game);
		System.out.println("ID is: "+ID);
		System.out.println("----------<");
	}
	
	
	
	
// but multiple constructors can be used to assigned different value of final based on parameter passed.
	public finalAndThis(int valOfFinal) { // Because, one object can call any one of the constructors. Hence final is assigned only once.
		this.ID=valOfFinal;
		System.out.println("ID final is: (1 para constructor) "+ID);
	}
	
// But once value is assigned to final it can't be changed. So we can initialize in either 1 or 2
// 1. When it is initialized.
// 2. In a constructor (for member variables), in static block (for static variables). [static are global]
	
	
	// we can also use static block to initialize final values if they are static also.
//	final int a;
	final static int b;
	static { // order if execution, static block-->main method-->Constructor.
//		a=14; error
		b=14;
		System.out.println("b from static block "+b);
	}
	
public static void main(String args[]) {
	finalAndThis obj=new finalAndThis(101, 21);
	finalAndThis obj1=new finalAndThis(102, 22);
	System.out.println("Address of obj : "+obj);
	System.out.println();
	System.out.println("Address of obj1 : "+obj1);
	System.out.println();
	
	finalAndThis obj3=new finalAndThis(14);
	// AS you can see this basically points to object of created, class/ constructor.
	
	
	/* [1] 
	 Note a abstract function/class & interface can't be final.
	 as abstract basically means inheritance is involved, (abstract functions are meant to be overridden but final prevents inheritance). 
	 Hence cant extend final class and can't override final function.
	 Eg- string class in java is final as well as most of primitive data types. So others cant change it by inheriting it.
	 Most of collections are not final. so we can change them.
	 So thats why we never make  or abstract class as final. 
	*/
	
	/* [2]
	Once we create object & make it final, its reference can be changed. Ie. = new className();  <- is not allowed.
	final car c=new car();
	c= new car(); <- This is not allowed.	 
	 */
	
	/* [3]
	Final class can't be extended but we can create its objects. 	 
	 */
	
	
	
	
}
}