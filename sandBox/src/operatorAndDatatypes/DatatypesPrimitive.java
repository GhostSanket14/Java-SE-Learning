package operatorAndDatatypes;

public class DatatypesPrimitive {
	
	int a;
	Integer b;
	
	public void Operator() {
		a = 0;
		b = 0;
		
		System.out.println( ((Object)a).getClass().getName());  // For primitive types
		System.out.println(b.getClass().getName()); // For Non-primitive
		
	}
	
	public static void main(String[] args) {
		DatatypesPrimitive obj1 = new DatatypesPrimitive();
		
		obj1.Operator();
		
	}
}