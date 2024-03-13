package linked_List;
import java.util.Scanner;

public class LinkList04InputNode {
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

	public void print(Node<Integer> temp) {
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		LinkList04InputNode obj=new LinkList04InputNode();
		Node<Integer> pass=obj.input();
		obj.print(pass);	
	
	}
}