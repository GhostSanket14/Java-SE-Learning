package linked_List;

import java.util.*;

public class merge2SortedLL {

	public static Node insert() {
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null, tail=null;

		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
			tail.next=newNode;
			tail=newNode;
		}
			data=sc.nextInt();
		}
		return head;
	}
	
	public static void print(Node head) {
		Node<Integer> tmp=head;
		while(tmp!=null) {
			System.out.print(tmp.data+" ");
			tmp=tmp.next;
		}
	}
	
	public static void merge(Node<Integer> head1, Node<Integer> head2) {

		Node<Integer> dummy=new Node<>(0), tail=dummy;
		
		while(true) {
			if(head1==null) {
				tail.next=head2;
				break;
			}
			if(head2==null) {
				tail.next=head1;
				break;
			}
			
			if(head1.data <= head2.data) {
				tail.next=head1;
				head1=head1.next;
			}
			else{
				tail.next=head2;
				head2=head2.next;
			}
			tail=tail.next;
		}
		print(dummy.next);
	}
	
	public static void main(String[] args) {
		Node<Integer> head1=insert();
		Node<Integer> head2=insert();
		print(head1);
		System.out.println();
		print(head2);
		
		merge(head1, head2);
		
	}
}