package X_CollecntionsSupport;

import java.util.Arrays;

public class String_bufferVSbuilder { // Methods used on string also work in SB and SBR

	public static void main(String srgs[]) {

	// STRING BUFFER vs BUILDER
	// Stringbuffer is thread safe and operations synchronized, so can be used in multithreaded strings env. Builder cant.
	// Builder is fast compared to buffer. And buffer is fast compared to String.
		
	// both have same methods.	
		
		StringBuffer sb=new StringBuffer("GHost"); // Thread safe, but slower than builder
		StringBuilder sbr=new StringBuilder("Sanket"); // not thread safe but faster than buffer
		
		sb.append("14"); // anything we append will be converted to string.
		sb.append(true);
		sb.append(123);
		System.out.println(sb); // OP- GHost14true123
		
		sb.insert(1,"Kolhapur"); // This will insert at index 1.
		System.out.println(sb); // OP- GKolhapurHost14true123
		
		sb.setCharAt(9,','); // To replace a character.
		System.out.println(sb); // OP- GKolhapur,ost14true123
		
		sb.deleteCharAt(9); // To delete a character.
		System.out.println(sb); // OP- GKolhapurost14true123
		
		sb.delete(1, 9); // To delete in range. (As we know in strings, end index is exclusive).
		System.out.println(sb);
		
		String rp=new String("With"); // we can also make string like this.
		sb.replace(6, 10, rp); // To replace a specific part.
		System.out.println(sb);
		
		sb.reverse(); // To reverse the string.
		
		StringBuilder sbt=new StringBuilder("xxSanket");
		String old="xx";
		int val=sbt.indexOf(old);
		sbt.replace(val, val+old.length(), "Geek");
		System.out.println(sbt);
		
		
	}
}