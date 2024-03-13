package OOPs2_abstractAndInterfaces;

public abstract class sanket extends papa{

	public abstract void childData(); // As this is a abstract function from a abstract class.
				// We either have to make it abstract(then we have to make this class abstract too) or define it.
		// Suppose we have 3 abstract function in parent. we can define each one in different class. it is not 
		// to mandatory define them in single class.
		// But remember if there is parent class with 2 abstract methods, but if we defined only one in first class
		// and defined other in 2nd class. In this case we have to make first class abstract. 
		// As 2nd incomplete function is yet to be completed and thus have to be abstract.
	
	public static void goodGuy() { // We can have normal function inside of a abstract class.  
		
	}
	
	// Note a abstract function/class can't be final.
	// because abstract basically means inheritance is involved. and final prevents inheritance. 
	
}