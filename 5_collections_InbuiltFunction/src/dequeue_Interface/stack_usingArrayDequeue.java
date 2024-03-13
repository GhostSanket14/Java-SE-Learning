package dequeue_Interface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class stack_usingArrayDequeue {

	public static void main(String[] args) {

		ArrayDeque<String> name=new ArrayDeque<>(); 	 // Functions are same as Legacy stack.
		
		System.out.println(name.peek()); // null if no element.
		
		name.push("Sanket");
		name.push("Virsha");
		name.push("Akshay");
				
		System.out.println(name.peek());
		
		name.pop(); // NoSuchElementException if no element.
		System.out.println(name.peek());
		
	}
}