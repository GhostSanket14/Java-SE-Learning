package linked_List;

public class LinkList02BasicOperations {

	public static void main(String[] args) { // These are basic nodes.

		Node<Integer> node1=new Node<>(10);
		Node<Integer> node2=new Node<>(20);
		
		System.out.println(node1.data); // These are still unlinked.
		System.out.println(node1.next);
		
		System.out.println(node2.data);
		System.out.println(node2.next);
		
		node1.next=node2; // This is how we can link 2 nodes.
		
		System.out.println(node1.data); // These are still unlinked.
		System.out.println(node1.next);
		
		System.out.println(node2.data);
		System.out.println(node2.next);
	}
}