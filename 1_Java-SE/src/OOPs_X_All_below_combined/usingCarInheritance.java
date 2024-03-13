package OOPs_X_All_below_combined;

public class usingCarInheritance {

	public static void main(String[] args) {

		carInheritance ci=new carInheritance();
		
		ci.print();
		ci.vehicleColor="Black"; // As we know we can access it like this as well.
		ci.print(); // Called function is first checked inside the class it is called in. If not then its parent, then its parent until found.
			// So above print will be of car class
		
		vehicleInheritance vi=new vehicleInheritance();
		vi.print(); // this print will be of vehicle class. As we are calling it via object of vehicle.
		
	}
}