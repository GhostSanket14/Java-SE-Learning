package dequeue_Interface;

import java.util.*;

public class dequeueFunctions {

	public static void main(String args[]) {
	// We mostly use Deque to make LL, and doing operations that LL using List can't.
	Deque<String> names=new ArrayDeque<>();
	
	Deque<Integer> ages=new ArrayDeque<>();
	ages.add(1);
	ages.add(2);
	ages.add(3);
	System.out.println(Collections.max(ages));
	
	// We already know offer(), peek(), poll() as we use this with Queue.
	// add() insert at end while push() inserts at front.
	// addFirst() and addLast() give Exception so we use these.
	names.offerLast("Sanket");
	names.offerFirst("Ghost");
	names.offerLast("Hunter");
	names.offerFirst("Cynide");
	System.out.println(names);
	
	// peekFirst() and peekLast()
	System.out.println("peek");
	System.out.println(names.peekLast());
	System.out.println(names.peekFirst());
	
	// getFirst() and getLast()
	System.out.println(names.getLast());
	System.out.println(names.getFirst());

	// pollFirst() and pollLast()
	System.out.println(names.pollLast());
	System.out.println(names.pollFirst());
	
	// removeFirst() and removeLast(). Note- remove() it removes first element. it gives exception instead of null. 
	names.removeLast();
	names.removeFirst();
	System.out.println(names);
	}
}