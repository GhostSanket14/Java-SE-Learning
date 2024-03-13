package OOPs1_polymorphism;

class Parent {
	void show() { 
		System.out.println("Parent's show()"); 
	}
}

// Inherited class
class Child extends Parent {
	void show(){
		System.out.println("Child's show()");
	}
}
class newChild extends Child {
		// as this class no show() methos above will be used.
}

public class methodOverriding { // its run time polymorphism

	public static void main(String[] args)
	{
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Parent obj1 = new Parent();
		obj1.show();

		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent obj2 = new newChild();
		obj2.show();
	}
}