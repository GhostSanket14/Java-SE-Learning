package linked_List;
import java.util.Scanner;

public class Node<X> { // Every time we create/call a Node this whole class creates one instance (node) for every input.
	X data;
	Node<X> next;
	
	public Node(X data) { // This is just a constructor to assign data.
		this.data=data;
		next=null;
	}
}