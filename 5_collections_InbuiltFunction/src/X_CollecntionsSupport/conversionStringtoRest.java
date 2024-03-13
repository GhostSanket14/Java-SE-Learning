package X_CollecntionsSupport;

public class conversionStringtoRest {

	public static void main(String[] args) {

		// STRING TO OTHER Data-types,  = wrapper.ParseInt/Float/Double/Long(__);
		String no="123";
		int nop1=Integer.parseInt(no);
		float nop2=Float.parseFloat(no);
		double nop3=Double.parseDouble(no);
		long nop4=Long.parseLong(no);
		System.out.println(nop1+" "+nop2+" "+nop3+" "+nop4); // OP- 123 123.0 123.0 123
		
		String bool1="True";
		String bool2="False";
		String bool3="true";
		String bool4="trueee";
		boolean b1=Boolean.parseBoolean(bool1);
		boolean b2=Boolean.parseBoolean(bool2);
		boolean b3=Boolean.parseBoolean(bool3);
		boolean b4=Boolean.parseBoolean(bool4);
		System.out.println(b1+" "+b2+" "+b3+" "+b4); // OP- true false true false   <- anything other than capital/small  true/false will be false.

		int a=1234;
		long b=nop4;
		String converted1=Integer.toString(a);
		String converted2=Long.toString(b);
		
	}
}