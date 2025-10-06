package OOPs1_constructor;

public class constructStudent {
	
	private int age;
	public int weight;
	
	public constructStudent() {
		System.out.println("No vales were passed, so default constructor .... !");
	}
	// We can create any number of constructors, but each constructors must have different no. of parameters.
	public constructStudent(int a, int b) {
		age=a; // Ie. now we cant have a constructor with 2 parameters as we have already build one with 2 parameters. 
				// Unless data type is different. Eg. below.
		weight=b;
		System.out.println("Constructor with age : "+age+" & weight "+weight);
	}
	public constructStudent(int a, String b) {
		age=a;			
		weight=Integer.parseInt(b);
		System.out.println("Constructor with age : "+age+" & weight "+weight);
	}
	public constructStudent(int a) {	
		age=a;
		System.out.println("Constructor with age : "+age);
		System.out.println("Constructor with age : "+age+" and weight "+weight); // weight is zero as 
	}						// while making the object constructor gives default value.
}