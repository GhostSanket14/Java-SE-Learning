package OOPs_X_All_below_combined;

public class staticCalling {

	public static int Add() {
		
		int a=0;
		
		return 0;
	}
	
	public static void main(String[] args) {
		staticUsing o1=new staticUsing(1,11);
		staticUsing o2=new staticUsing(2,21);
		staticUsing o3=new staticUsing(2,31);
//		System.out.println(staticUsing.calculateObjCreated); // As class owns staic we can directly access it vis class name.  
											// But we shoud'ent allow anyone to change this value. like this. 
								// So we make it private and make getter and setter to access it instead.
		
		System.out.println(staticUsing.getObjNum()); // This way, by making static private we can make it access only where we want.

		System.out.println(o1.getObjNum()); // This is also possible, but it is not a good practice. Above is.
	}
}