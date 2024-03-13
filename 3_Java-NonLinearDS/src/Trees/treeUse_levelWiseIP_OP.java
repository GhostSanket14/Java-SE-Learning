package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class treeUse_levelWiseIP_OP {

	public static treeNode<Integer> levelWiseInput(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter root ");
		int rootData=sc.nextInt();
		
		Queue<treeNode<Integer>> pendingNodes=new LinkedList<>(); 
		treeNode<Integer> root=new treeNode<>(rootData); // First we ask for root node.
		
		pendingNodes.offer(root); // We add that root node in queue.
		
		while(!pendingNodes.isEmpty()) { // We will do operation until queue is empty.
			
			treeNode<Integer> frontNode=pendingNodes.poll(); // We take first element of queue as root.
			
			System.out.println("Enter No. of children for "+frontNode.data); // We take no of child for first element taken above.
			int childNo=sc.nextInt();
			for(int i=0; i<childNo; i++) {
				System.out.println("Enter "+(i+1)+"th child of "+frontNode.data); // We will take input of child for the root(first element taken above).
				int child=sc.nextInt();												// We do this one by one.
				treeNode<Integer> node=new treeNode<>(child); // We create node for each child.
				frontNode.children.add(node); // Then we attach child to its parent.
				pendingNodes.offer(node); // We also add them to queue, to be used as root later.(Basically we ask for child of each node)
			}
		}
		
		return root;
				
	}
	// I will make this level wise later. :)
	public static void print(treeNode<Integer> root) {

		String s=root.data+": ";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		treeNode<Integer> root= levelWiseInput();
		print(root);
	}
}