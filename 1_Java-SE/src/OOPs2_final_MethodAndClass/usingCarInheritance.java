package OOPs2_final_MethodAndClass;

public class usingCarInheritance { // 

	public static void main(String[] args) {
	
		carInheritance CI=new carInheritance();
		
		// As per rule of Overloading, most recent function will be called. which are of same name.
		// But if a function is final , then there cant be any function with same name.
		
		CI.print();

	}
}