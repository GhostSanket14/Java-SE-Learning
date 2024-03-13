package OOPs1_polymorphism;

public class usingCar {

	public static void main(String[] args) {

//		Reference to parent = Instance of Child		(object is of child & reference is of parent) Its all game of reference.
		vehicle V=new car(); // This is polymorphism. As every car is also a vehicle.
				// Here basically v can point to anywhere, either itself or all of its subclasses.
		
		// but here the v can use only access vehicle specific elements. and elements that are common in both car and vehicle. Eg. print()
		// Hence anything extra in Car is not used. 
		// Eg- List al=new ArrayList(); this way function that are only in List or List as well as ArrayList will be used. 
		
//		V.printC(); // V cant call the function for specific car.
		V.printV(); // V can call the function of vehicle specifically.
		V.print(); // elements that are common in both car and vehicle. 
		// print() from car will run. As Reference are for accessing and functions from initializing class are called.
		// Basically we cant access child specific using parent reference . 
		
		System.out.println(V.vehicleType);
	}
} 
// op- 
// VEHICLE printV .... !
// CAR print ....
// Vehile_APC