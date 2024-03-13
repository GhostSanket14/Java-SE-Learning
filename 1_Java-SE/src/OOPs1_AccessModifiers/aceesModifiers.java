package OOPs1_AccessModifiers;

public class aceesModifiers { // but global class can't be private. 
	// similarly if we made a default class it wont be accessible outside the package.
	private class test{ //  we can make nested private class.
		
	}
	
	public String name1="Sanket"; // Can be accessed anywhere.
	String name2="Ghost"; // can be accessed only in this package.
	private String name3="God"; // can be accessed only in class created into. (we can use getter & setter to access it somewhere else)
	
	public void setName(String name) {
		name3=name;
	}
	public String getName() {
		return name3;
	}

}