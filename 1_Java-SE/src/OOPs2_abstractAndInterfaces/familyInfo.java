package OOPs2_abstractAndInterfaces;

public interface familyInfo extends testing { // one interface can extend another interface. but then we have to define functions of both interfaces
	// in whatever class that implements familyInfo
	
	public void memberName();
	
	public void personAge();
	
	// We mostly don't store data-types in interface but if u want to they have to be final and static (as good habit not rule)
	public final static double PI=3.14; // We mostly only store constant into interface.
	
	default void testing() { // We can have method body but we have to make it default.
	// Also When you declare a method as default in an interface, 
	//it is still public and abstract in terms of its accessibility and behavior. However, it now has a default implementation 
	//that provides some functionality for the method, which can be overridden by the classes implementing the interface.
	}
	
	static void stuff() { // We can also have static function. Like this.
		
	}
	
//	public static void testingStacNotManditory(); // if we make a function static in interface we have to define it.
	
}