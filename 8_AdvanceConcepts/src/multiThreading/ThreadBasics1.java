package multiThreading;

public class ThreadBasics1 {

	public static void main(String[] args) { 
		// Multithreading allowing concurrent execution of two or more parts of a program for max CPU utilization.
		// Basically a program is split in light weight processes, called threads.
		// Basically It can create separate path of execution.
		// Two ways to create threads. 1. Extending thread class 2. implementing runnable interface
		// We have to use start() method to run multiple concurrent threads. And not run()	
		
		ThreadBasics1_support thatThread=new ThreadBasics1_support();
		ThreadBasics1_support thatThread1=new ThreadBasics1_support();
		thatThread.start(); // Use start to run the thread. If we use Run() it will work like single thread.
		thatThread1.start(); // Use start to run the thread. If we use Run() it will work like single thread.		
	}
}

// Read this before interview.

// https://www.digitalocean.com/community/tutorials/multithreading-in-java 