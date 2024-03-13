package OOPs_X_All_below_combined;

public class usingAccessModifier {

	public static void main(String[] args) {

		aceesModifiers am=new aceesModifiers();
		
		System.out.println(am.name1);
		System.out.println(am.name2);
		am.name2="GG";
		System.out.println(am.name2);
//		System.out.println(am.name3); // ERROR it is private (so using getter and setter below)
		
		am.setName("Bhavani Mata");
		System.out.println(am.getName());
	}
}