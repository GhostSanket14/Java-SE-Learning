package OOPs1_polymorphism;

public class car extends vehicle {
	String vehicleType="Vehicle_MRAP";
	int val=14;
	public void printC() {
		System.out.println("CAR printC .... !");
	}
	public void print() { // if u remove this, as per overriding rule, print() from vehicle will run.
		System.out.println("CAR print ....");
	}
}