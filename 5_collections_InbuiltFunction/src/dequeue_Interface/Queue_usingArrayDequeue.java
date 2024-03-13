package dequeue_Interface;

import java.util.*;

public class Queue_usingArrayDequeue {

	public static void main(String[] args) {
// Using ArrayDeque is prefferd over LL. as AD has O(1) time complexity for almost all operations.
		Deque<String> guns=new ArrayDeque<>(); // Functions are same as LinkedList.
		// we use offer() peek() pop() , instead of add(), element(), remove() because these can throw exception. 
		// pop() simple gives null if queue is already empty.
				
		guns.offer("Ak");
		guns.offer("M4");
		guns.offer("SKS");
		guns.offerFirst("SMG");
		guns.offerLast("SMG");
		
		Iterator<String> itr= guns.iterator(); // iterator does work with AD
		while(itr.hasNext()) { 
		System.out.println(itr.next());
		}
		
		System.out.println(guns.peek());
		guns.pop();
		System.out.println(guns.peek());
		String peek=guns.peek();
		System.out.println(peek);

		
		// One real life use can be resource sharing in OS.
		
	}
}