package OOPs_X_All_below_combined;

public class aceesModifiers {
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