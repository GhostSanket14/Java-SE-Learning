package OOPs2_exceptionHandling;

public class testException {
	
	public void divide(int pass) throws dividingByZeroEXC {
		int a=pass;
		int b=10;
		if(a==0) {
		dividingByZeroEXC e=new dividingByZeroEXC();
		throw e;
		}
		int c=a/b;
	}
	
	public void testingExceptiontheory() throws dividingByZeroEXC { // If we dont want to handle it we have to keep writing throws.
		divide(0);
	}

	public void justtesting() { // As this function didnt access divide method. We dont have to handle it.
		System.out.println();
	}
	
	public static void main(String[] args) { // If at any function we want to handle the exception. we have to use try-catch.
			// remember this 'throws' only have to be done where the function with exception is called.
		testException obj=new testException();
		
		try {
		obj.testingExceptiontheory();
		}
		catch(dividingByZeroEXC e){
			System.out.println("Zero ne tuza baba tari divide krto kai .... ! ");
		}
		finally {
			System.out.println("This is common part, that must be executed .... After either TRY or CATCH ");
		} // Finally is used to run a compulsory code. After TRY or CATCH as there might be some code
		  // That must be executed in the end.
	}
}