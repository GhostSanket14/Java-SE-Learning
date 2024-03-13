package OOPs2_inheritanceAndConstructor;

public class usingCarInheritance {

	public static void main(String[] args) {
		
//		vehicleInheritance VI=new vehicleInheritance(); // Vehicle constructor will call default vehicle constructor.
		
		System.out.println("|| ------------- || ");
		
		carInheritance CI=new carInheritance(10,14); // Car constructor will call both its default and vehicle default constructor.
 				// This is because when we create a child object, a parent object is also created. And then they call default constructor.
				// 
				// But if we dont have a default parent/super constructor. In that case it will give error. So
				// We have to use super keyword. inside constructor of child so to pass value to parameterized/default constructor of parent/super.

	}
}