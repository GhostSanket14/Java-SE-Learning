package binaryTree;

import java.util.*;
import java.util.Scanner;

public class bTreeUse_IPOP_iteratively {
	
	public static bTreeNode<Integer> inputLevelwise(){
		Scanner sc=new Scanner(System.in);
		Queue<bTreeNode<Integer>> pendingNodes=new LinkedList<>();
		System.out.println("Enter root : ");
		int rootData=sc.nextInt();
		
		bTreeNode<Integer> root=new bTreeNode<>(rootData);
		pendingNodes.offer(root);
		
		if(rootData==-1) {
			return null; 
		}
		while(!pendingNodes.isEmpty()) {
			bTreeNode<Integer> frontNode=pendingNodes.poll();
			System.out.println("Enter left for node "+frontNode.data);
			int Data=sc.nextInt();
			if(Data!=-1) {
				bTreeNode<Integer> node=new bTreeNode<>(Data);
				pendingNodes.offer(node);
				frontNode.left=node;
			}
			
			System.out.println("Enter right for node "+frontNode.data);
			Data=sc.nextInt();
			if(Data!=-1) {
				bTreeNode<Integer> node=new bTreeNode<>(Data);
				pendingNodes.offer(node);
				frontNode.right=node;
			}
		}
			return root;
	}

	public static void printRecursive(bTreeNode<Integer> root) {
		if(root==null) { // Base case.
			return;// We return nothing, to avoid null pointer, (discussed this before in Tree)
		}
		String toPrint=root.data+" "; // If above is true we store root in string.
		
		if(root.left!=null) {
			toPrint+="L:"+root.left.data+" "; // If above is true we store left in string.
		}
		if(root.right!=null) {
			toPrint+="R:"+root.right.data+" "; // If above is true we store right in string.
		}
		System.out.println(toPrint);
		printRecursive(root.left); // Finally we will do this for all L and R until null on all sides is reached. 
		printRecursive(root.right);
	}
		
	public static void printLevelWise(bTreeNode<Integer> root) { // I will do it. Did it Boi :)
		
		Queue<bTreeNode<Integer>> pendingNodes=new LinkedList<>();
		pendingNodes.offer(root);
		
		while(!pendingNodes.isEmpty()) {
			bTreeNode<Integer> frontNode=pendingNodes.poll();
			System.out.print(frontNode.data+": ");
			
			if(frontNode.left!=null) {
				System.out.print("L "+frontNode.left.data+" ");
				pendingNodes.offer(frontNode.left);
			}
			if(frontNode.right!=null) {
				System.out.print("R "+frontNode.right.data);
				pendingNodes.offer(frontNode.right);
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		bTreeNode<Integer> root=inputLevelwise();
//		printRecursive(root);
		System.out.println();
		printLevelWise(root);
	}
}