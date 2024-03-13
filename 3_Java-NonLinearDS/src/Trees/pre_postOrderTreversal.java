package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class pre_postOrderTreversal {
	
	public static treeNode<Integer> levelWiseInput(){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter root ");
		int rootData=sc.nextInt();
		
		Queue<treeNode<Integer>> pendingNodes=new LinkedList<>(); 
		treeNode<Integer> root=new treeNode<>(rootData);
		
		pendingNodes.offer(root);
		
		while(!pendingNodes.isEmpty()) {
			
			treeNode<Integer> frontNode=pendingNodes.poll();
			
			System.out.println("Enter No. of children for "+frontNode.data);
			int childNo=sc.nextInt();
			for(int i=0; i<childNo; i++) {
				System.out.println("Enter "+(i+1)+"th child of "+frontNode.data); 
				int child=sc.nextInt();												
				treeNode<Integer> node=new treeNode<>(child); 
				frontNode.children.add(node); 
				pendingNodes.offer(node);
			}
		}
		
		return root;
				
	}
	
	public static void preOrder(treeNode<Integer> root){ // N L R
		if(root==null) {
			return; // NO base case, this is just to avoid null pointer exception. when we reach last node, we dont want to access root.data as it will give exception.
		}
		
		int data=root.data;
		System.out.print(data+" ");
		for(int i=0; i<root.children.size(); i++) { // So the loop and recursion itself works in a way that makes preorder.
			preOrder(root.children.get(i));
		}
	}
	
	// Did this one myself.
	public static void postOrder(treeNode<Integer> root) { // L R N
		if(root==null) { 
			return;
		}
		
		for(int i=0; i<root.children.size(); i++) {
			postOrder(root.children.get(i));
		}
		System.out.print(root.data+" ");
	}
	
	public static void main(String[] args) {
		treeNode<Integer> root=levelWiseInput();
		System.out.println("Pre Order");
		preOrder(root);
		System.out.println();
		System.out.println("Post Order");
		postOrder(root);
	}
}