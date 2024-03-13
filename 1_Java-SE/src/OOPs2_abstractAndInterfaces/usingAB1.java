package OOPs2_abstractAndInterfaces;

public class usingAB1 {

	public static void main(String[] args) {
		shweta s=new shweta();
		s.childData();
		s.papaData();
		
		testing objOfInterface= new testing() { // If we try to make object of interface, it will make a anonymous inner class.
			@Override			 	// and make us define function into. As we need to have function definition somewhere.
			public void show() {
				// TODO Auto-generated method stub
				
			}
		};
		
		// and if it dont have any abstract methods, it will make empty anonymous inner class.
		// Eg- testing objOfInterface= new testing() { };
		
		// Rule- 1. class ----> class [extends]
		//       2. interface ----> interface [extends]
		// 		 3. class ----> interface [implements]
		
	}
}