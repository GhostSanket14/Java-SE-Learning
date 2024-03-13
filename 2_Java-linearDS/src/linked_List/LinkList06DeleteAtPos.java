package linked_List;
import java.util.Scanner;

public class LinkList06DeleteAtPos {
Scanner sc=new Scanner(System.in);
	
	public Node input() {
		Node<Integer> head=null, tail=null; // Created empty head & tail node.
		int data=sc.nextInt();
		while(data!=-1) {
			Node<Integer> newNode=new Node<>(data); // Creating node for every input.
				if(head==null) { // This is only for first insert.
					head=newNode; // So if head has nothing. Then only first node will be linked to it.
					tail=newNode; // We will also maintain a tail for element added at the end.
				}
				else{
					tail.next=newNode; // This will add new node at the end of LL.
					tail=newNode; // Above we added a new node at end. So we also have to update our tail.
								  // Hence this newNode will become our new tail.
				}			// This concept of tail will save us lot of travel time. As we will always have something to point end.
				data=sc.nextInt();
			}	
		return head;	
		}
	
	public static Node insert(Node<Integer> head, int data, int pos) { // while inserting 3 nodes are involved. <previous, we want, next>
		Node<Integer> newNode=new Node<>(data);
		int i=0;
		if(pos==i) { // If want to insert at o'th pos. we just change the head pointer.
			newNode.next=head;
			return newNode; // remember to update head in main.
		}
		Node<Integer> temp=head;
		while(i<pos-1) { // We have to stop at previous node. This condition will stop when i will become equal to pos-1
			temp=temp.next; // Now we use this temp below.			
			i++;
		}
		newNode.next=temp.next; // Do this first. And them below line. otherwise u will override the line.
		temp.next=newNode; // Basically we first created a link between newNode and temp.next then finally we made link between temp.next to newNode
		
		return head;
	}
	
	public static Node delete(Node<Integer> head, int pos) { // while deleting 3 nodes are involved. <previous, we want, next>
		int i=0;
		if(pos==i) { // If want to delete at o'th pos. we just change the head pointer.
			head=head.next;
			return head;
		}
		Node<Integer> temp=head;
		
		while(i<pos-1) { // We have to stop at previous node. This condition will stop when i will become equal to pos-1
			temp=temp.next; // Now we use this temp below.			
			i++;
		}
		temp.next=temp.next.next; // This will basically skip the element ahead of position.
		
		return head;
	}
	
	public void print(Node<Integer> temp) {
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		LinkList06DeleteAtPos obj=new LinkList06DeleteAtPos();
		Node<Integer> head=obj.input();
		System.out.println("Input done");
		obj.print(head);
		
		head=obj.insert(head, 14,0); // We have to update head. We in insert function we have changed it.
		System.out.println("Insert 14 at pos 0 done");
		obj.print(head);
		head=obj.insert(head, 15,3); // We have to update head. We in insert function we have changed it.
		System.out.println("Input 15 at pos 3 done");
		obj.print(head);
		
		
		obj.delete(head, 3);
		System.out.println("delete at pos 3 done");
		obj.print(head);		
	}
}