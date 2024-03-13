package queue_Interface;
import java.util.*;

public class priorityQueue { // It don't support null

	public static void main(String[] args) {
		// It implements Heap Data structure. (Min heap by default)

		
		PriorityQueue<Integer> pqMin=new PriorityQueue<>(); // This is min heap. Small to big
		// In this case small element have high priority.
		
		PriorityQueue<Integer> pqMax=new PriorityQueue<>(Collections.reverseOrder()); // This is max heap. Big to small
		pqMax.offer(1);
		pqMax.offer(6);
		pqMax.offer(8);
		pqMax.offer(2);
		pqMax.offer(4);
		pqMax.offer(0);
		
		System.out.println(pqMax);
		System.out.println(pqMax.poll()); // OP- 8
		System.out.println(pqMax.poll()); // OP- 6
		System.out.println(pqMax.poll()); // OP- 4
		System.out.println(pqMax.contains(3));
		
			
		// In this case large element have high priority.
		
		// We can use PQ to from items bigger to smaller OR smaller to Bigger. Basically a BST. 
		// This we can helpful in many ways. 
		
		// offer(), peek(), poll() and remove()
		// This can also use all functions in Queue and Collections interface.

		// iterator dont traverse PQ. like while() or for(:) loop. Ie. while() and for() traverse based in priority.
		// But iterator traverse, elements are returned in random order from what present in the Queue.
		
	}
}