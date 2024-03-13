package OOPs_X_All_below_combined;

public class carInheritance extends vehicleInheritance {
	String vehicleType;
	
	public void print() {
		System.out.println("vehicle ID : "+vehicleID+" vehicle color : "+vehicleColor); // WE can use these data types directly as we have inherited them from their parent.
		
		System.out.println(" vehicle price : "+getPrice()); // we inherited the variable but as it is private we have to access it via getter and setter.
		
		System.out.println("vehicleType is : "+vehicleType);
		System.out.println();
		
		super.print(); // we can use super to point to parent of child.
	}
}