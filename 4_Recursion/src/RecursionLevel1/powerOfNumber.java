package RecursionLevel1;

public class powerOfNumber {

	
	public static int power(int base, int power) {
		if(power==0) {
			return 1;
		}
		int smlAns=power(base, power-1);
		return base*smlAns;
	}
		
	public static int PW(int base, int power) {
		if(power==0) {
			return 1;
		}
		int ans=0;
		
		ans=base*PW(base, power-1);
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(power(4,6));
		System.out.println(PW(4,6));
	}
}