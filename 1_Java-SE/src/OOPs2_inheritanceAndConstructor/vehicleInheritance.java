package OOPs2_inheritanceAndConstructor;

public class vehicleInheritance {

	public vehicleInheritance() { // Default constructor wont run if there is custom.
		System.out.println("This is Default constructor of VEHICLE ");
	}
	
	public vehicleInheritance(int pass) { // as there is no default vehicle constructor.
		System.out.println("This is Custom constructor of VEHICLE "+pass);
	}
	
	public void print() {
		System.out.println("VEHICLE print .... !");
	}
}