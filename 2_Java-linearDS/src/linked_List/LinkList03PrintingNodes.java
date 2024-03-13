package linked_List;

public class LinkList03PrintingNodes {

	public static void main(String[] args) {


		Node<Integer> node1=new Node<>(10); // I made 3 nodes and linked them.
		Node<Integer> node2=new Node<>(20);
		Node<Integer> node3=new Node<>(30);
			

		node1.next=node2;	// All 3 nodes are linked, now we will print All nodes.
		node2.next=node3;	// node1.next=node works because all 'node' are just reference address. 

		Node<Integer> head=node1;	// We made a head.
		Node<Integer> temp=head;	// We actually never risk loosing true value of head.
									// So we use a Temp node to do all dirty work.

		while(temp.next !=null ) {	// Remember we have to go till node pointing to null.
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
				
	}
}