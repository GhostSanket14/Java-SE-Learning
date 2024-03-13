package List_Interface;

import java.util.Iterator;
import java.util.*;

public class stack_usingStackClass 
{
	public static void main(String[] args) {

		Stack<String> Guns=new Stack<>(); // a stack is created.
		// Stack is used in Managing function calls and stack span problem, 
		// recursion, evaluation of postfix expression, string reversing. etc
		
		Guns.push("AK47");  // push() will push in the elements.
		Guns.push("M416");
		Guns.push("Galil");
		Guns.push("Beretta");

		System.out.println("Search() "+Guns.search("M416")); // Gives length from top of stack. 1 based indexing.
		
		
		Iterator<String> itr= Guns.iterator(); // iterator does work with stack.
		while(itr.hasNext()) { 
		System.out.println(itr.next());
		}
		
		for(String s:Guns) { // This also work with stack.
			System.out.println(s);
		}
		
		System.out.println(Guns.peek()); // To see the element at Top
		System.out.println(Guns);
		
		System.out.println(Guns.get(0)); // We can access random element in Stack only in stack class.
		
		System.out.println(Guns.pop()); // To pop the elements at Top
		System.out.println(Guns.pop());
		System.out.println(Guns);
				
	}
}