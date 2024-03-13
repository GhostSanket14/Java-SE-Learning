package OOPs2_inheritanceAndConstructor;

public class carInheritance extends vehicleInheritance {
	String vehicleType;
	
	public carInheritance() { // Default constructor wont run if there is custom.
		System.out.println("This is a default constructor of CAR ");
	}
	public carInheritance(int cpass, int vpass) {
//		super();  this will run the default constructor of vehicle.
		super(vpass); // To call custom cons of parent. we use super so solve error. (remove super to see the issue).
			// Implicit super constructor vehicleInheritance() is undefined. Must explicitly invoke another constructor
		System.out.println("This is a custom constructor of CAR "+cpass);
	}
	
	public void print() {
		System.out.println("CAR print .... !");
	}
}