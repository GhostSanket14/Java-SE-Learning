package multiThreading;

public class ThreadBasics2_support implements Runnable { // it is advice'd to use Runnable. As we can only extend 1 class. (Multiple inheritance issue) 
	
	// Note- just because a thread is created first, its not necessary execution pattern will be same.
		// It means thread are running independently. And issue with one wont affect the other (not even main). 
		// Suppose 1 thread and 1 main thread. Once main thread reaches the line where there is 1 thread,
		// It starts off execution and then continues further. This means main and that 1 thread are not running parallel.
	
	private int threadNum=0;
	public ThreadBasics2_support(int threadNum) { // this way we can assign thread number.
	this.threadNum=threadNum;
	}	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i+" ThreadNumber is "+threadNum+" - "+Thread.currentThread().getName());			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}	
}