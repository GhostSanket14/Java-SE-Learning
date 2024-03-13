package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BST_printNodesInRange {
	public static bstNode<Integer> inputLevelWise(){
		Scanner sc=new Scanner(System.in);
		Queue<bstNode<Integer>> pendingNodes=new LinkedList<>();
		System.out.println("Input ROOT ");
		int rootData=sc.nextInt();
		bstNode<Integer> root=new bstNode<Integer>(rootData);
		pendingNodes.offer(root);
		while(! pendingNodes.isEmpty()) {
			bstNode<Integer> newNode=pendingNodes.poll();

			System.out.println("Left value (less than) root: "+newNode.data);
			rootData=sc.nextInt();
			if(rootData<newNode.data && rootData!=-1) { // This will input in left and -1 will stop the input.
				bstNode<Integer> child=new bstNode<>(rootData);
				newNode.left=child;
				pendingNodes.offer(child);
			}
			System.out.println("Right value (more than) root: "+newNode.data);
			rootData=sc.nextInt();
			if(rootData>newNode.data && rootData!=-1) { // This will input in right and -1 will stop the input.
				bstNode<Integer> child=new bstNode<>(rootData);
				newNode.right=child;
				pendingNodes.offer(child);
			}
		}
		return root;
	}
	
	public static void printLevel(bstNode<Integer> root) {
		Queue<bstNode<Integer>> pendingNodes=new LinkedList<>();
		pendingNodes.offer(root);
		while(! pendingNodes.isEmpty()) {
			bstNode<Integer> printRoot=pendingNodes.poll();
			if(printRoot!=null) {
				System.out.print("N:"+printRoot.data+", ");
			}
			if(printRoot.left!=null) {
				System.out.print("L:"+printRoot.left.data);
				pendingNodes.offer(printRoot.left);
			}
			if(printRoot.right!=null) {
				System.out.print(" R:"+printRoot.right.data);
				pendingNodes.offer(printRoot.right);
			}
			System.out.println();
		}
	}
	
	public static void printInRange(bstNode<Integer> root, int min, int max) {
		if(root==null) {
			return;
		}
		if(root.data>=min && root.data<=max) { // This condition will help u remember below 2 conditions.
			System.out.print(root.data+" ");
		}
		if(min<root.data) { // Go to left until root is greater than minimum.
			printInRange(root.left, min, max);
		}
		if(root.data<max) { // Go to right until root is less than max.
			printInRange(root.right, min, max);
		} // Above 3 comments will make sense. As know left of BST is small than node and right is big than node.
		
	}
	
	public static void main(String[] args) {
		bstNode<Integer> root=inputLevelWise(); // 9 5 15 4 6 12 20 -1 -1 -1 -1 11 13 -1 -1 -1 -1 -1 -1
		printLevel(root);
		System.out.println("-----------");
		printInRange(root, 1, 10); // Print data that is within 4 to 6 range.
	}
}