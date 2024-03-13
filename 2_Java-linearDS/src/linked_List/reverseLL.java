package linked_List;
import java.util.*;

public class reverseLL {
	Scanner sc=new Scanner(System.in);
	public Node input() {
		Node<Integer> head=null, tail=null;
		int data=sc.nextInt();
		while(data!=-1) {
			Node<Integer> newNode=new Node<>(data);
				if(head==null) { 
					head=newNode;
					tail=newNode;
				}
				else{
					tail.next=newNode;
					tail=newNode; 
				}
				data=sc.nextInt();
			}
		return head;
		}

	public static void print(Node<Integer> temp) {
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void reverse(Node<Integer> temp) {
		
		Node<Integer> pre=null, cur=temp, next=null; // Making 3 pointers.
		
		while(cur!=null) {
			next=cur.next;
			cur.next=pre;
			pre=cur;
			cur=next;
		}
	System.out.println("This is from original Reverse:");
	print(pre); // As we are taking current to null. Previous will be at 1 element before that.		
	} // make sure to pass previous node. As its the one making links.
	
	public static void main(String[] args) {
		LinkList04InputNode obj=new LinkList04InputNode();
		Node<Integer> pass=obj.input();
		obj.print(pass);
		reverse(pass);
	}
}