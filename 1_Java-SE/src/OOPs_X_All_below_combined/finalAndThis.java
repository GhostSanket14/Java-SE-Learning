package OOPs_X_All_below_combined;

public class finalAndThis {

	final int ID;
	int Age=10;   // These values comes under 'this' . So when we use this these are the vales we are referring to.
	
	public finalAndThis(int valOfFinal, int Age) { // This is 2nd and preferred way to assign value to final.
		ID=valOfFinal;
		Age=Age; // So here if i used this.Age=Age the value in actual instance above will be updated.		
		// In above Age=Age what we are basically doing is assigning local vale to local value. Hence use of this is necessary.
		System.out.println(Age); // (this will print the value we pass)
		System.out.println(this.Age); // ( this will print value in instance, i.e 10)	// this is used to solve the conflict that may occur due to similar names.
		System.out.println("Address of this in constructor : "+this); // This will give address of reference object we have created. ie obj in main()
	}
	
//	public finalAndThis(int Age) { // This will give us error as we didnt assign value to ID (final) it is not allowed.
//		Age=Age;
//	}
	
public static void main(String args[]) {
	finalAndThis obj=new finalAndThis(001, 21);
	finalAndThis obj1=new finalAndThis(002, 22);
	System.out.println("Address of obj : "+obj);
	System.out.println("Address of obj1 : "+obj1);
	
	// AS you can see this basically points to object of created, class/ constructor.
}
}