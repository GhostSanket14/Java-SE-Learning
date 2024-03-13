package OOPs1_AccessModifiers;

public class usingAccessModifier {
	
	public static void main(String[] args) {

		aceesModifiers am=new aceesModifiers();
		
		System.out.println(am.name1);
		System.out.println(am.name2);
		am.name2="GG";
		System.out.println(am.name2);
//		System.out.println(am.name3); // ERROR it is private (so using getter and setter below)
		
		am.setName("Bhavani Maa");
		System.out.println(am.getName());
		
		protectedData pD=new protectedData();
		System.out.println(pD.d); // As protected can be accessed within same package just normally.
		// So its kindof made to overcome drawback of public.
	}	
}