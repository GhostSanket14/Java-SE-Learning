package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BST_checkIfBalanced {
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
	
	// We will get true only if. We have reached the end. And the end returns true. Otherwise the false will be returned. 
	public static boolean isBSTbalanced(bstNode<Integer> root, int min, int max) { 
		if(root==null) { // This means we have reached the end successfully. So return all leaf nodes true.
			return true;
		}
		if(root.data<min || root.data>max) { // Check if out of range.
			return false;
		}
		
		boolean flagLeft=isBSTbalanced(root.left, min, root.data-1); // left side is min___root.data-1
		boolean flagRight=isBSTbalanced(root.right, root.data, max); // left side is root.data___max
		
		return flagLeft && flagRight; // This will return true when L and R are true.
	}
	
	public static void main(String[] args) {
		System.out.println("If you dont follow instructions. Wrong inputs will not be taken");
		bstNode<Integer> root=inputLevelWise();
		printLevel(root);
		
		System.out.println(isBSTbalanced(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
	}
}