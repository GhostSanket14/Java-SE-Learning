package List_Interface;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_usingLinkedList {

	public static void main(String[] args) {

		Queue<String> foodLine=new LinkedList<>(); // We are making a queue with linked list.
										// linked list is implementing queue interface. so some LL function are usable as well.
		
		// offer() is used to add elements to Queue. <- We use this instead of add(), because add() throws an exception.
		foodLine.offer("Aanket"); // Front-head
		foodLine.offer("Banket");
		foodLine.offer("Canket");
		foodLine.offer("Danket"); // Rear-tail
		System.out.println(foodLine);
		
		
		System.out.println("contains() "+foodLine.contains("Banket")); // This function comes from LL
		
		// peek() is used to check element at front-head. <- We use this instead of element(), because element() throws an exception.
		System.out.println("At head "+foodLine.peek());
		
		// poll() <- We use this instead of remove(), because remove() throws an exception.
		System.out.println("Head removed : "+foodLine.poll());
		
		System.out.println("At head "+foodLine.peek());
		
		
		// WE use offer() , peek() and poll() because they return. offer() return true-false. peek() & poll() returns null it Queue is empty.
	}
}