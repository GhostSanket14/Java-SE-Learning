package multiThreading;

public class ThreadBasics1_support extends Thread { // Step1- We first have to extend Thread class.

	// Step2- Then we have to override run() method. It is inbuilt thread method.
	@Override  // Make sure to use @Override annotation here.
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}	
}