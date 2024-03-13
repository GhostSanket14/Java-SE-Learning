package OOPs_X_All_below_combined;

public class vehicleInheritance {

	int vehicleID;
	String vehicleColor;
	private int vehiclePrice;
	
	public void print() {
		System.out.println("vehicle ID : "+vehicleID+" vehicle color : "+vehicleColor+" vehicle price : "+vehiclePrice);
		System.out.println("IN VEHICLE CLASS ------------ ");
		System.out.println();
	}
	
	public int getPrice() { // car did inherit the vehiclePrice but as it is private. car has to access it using getter and setter.
		return vehiclePrice;
	}
}