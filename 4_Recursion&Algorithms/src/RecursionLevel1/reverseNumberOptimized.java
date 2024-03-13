package RecursionLevel1;

public class reverseNumberOptimized {
	
	public static int rev(int N) {
		int ans=0;
		ans=revH(N, ans);
		return ans;
	}
	
	public static int revH(int N, int ans) {
		if(N==0) {
			return ans; // I am so happy this is my logic.
		}
		int val=0;
		int last=N%10;
		ans=ans*10+last;
		val=revH(N/10,ans);
		return val;
	}
	
	public static void main(String[] args) {
		System.out.println(revH(1234, 0));
	}
}