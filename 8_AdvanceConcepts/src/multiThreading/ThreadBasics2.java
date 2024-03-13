package multiThreading;

public class ThreadBasics2 {

	public static void main(String[] args) {
		
		// We can make multiple threads via loop.
		for(int i=0; i<5; i++) {
		ThreadBasics2_support thread=new ThreadBasics2_support(i); // because runnable don't have run() method. (jbdl 59)
		Thread myThread=new Thread(thread); // There are the changes we have to make. Id we used Runnable.
		myThread.start();
		myThread.isAlive(); // Checks if thread is alive or not. Returns boolean value.
		
		// we can also do this.
		Thread thr=new Thread(new ThreadBasics1_support());
		// we can use 'ThreadBasics1_support' as this has extended the Thread class.
		// since 'ThreadBasics2_support' has runnable, we can't use it like this.
		
		// again another way to create thread. 
		Thread th=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Another method to create thread."+Thread.currentThread().getName());
			}
		
		});
		th.start();
		}
	}
}