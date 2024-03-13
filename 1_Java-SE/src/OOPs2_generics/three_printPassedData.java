package OOPs2_generics;

public class three_printPassedData <A,B>  {

	private A passedData; // This A is our generic, Basically a datatype at runtime.
	
	public void setData(A pass) {
		passedData=pass;
	}
	
	public A getData() {
		return passedData;
	}
 	
	public void printt(B npass) {
		System.out.println("Second dataype value passed via generic : "+npass);
	}	
}