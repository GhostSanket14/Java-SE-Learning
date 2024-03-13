package OOPs1_support;

import OOPs_X_All_below_combined.*;

public class usingProtected extends protectedData {

	public void show() {
		System.out.println(d); // as d is from protectedData and since we inherit it, we can use it without creating object.
	}
	
	public static void main(String[] args) {
		usingProtected o=new usingProtected();
		o.show();
	}
}