package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bTreeUse_3_traversals {

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
	public static void inorder(bTreeNode<Integer> root) {
		if(root==null) { // Sanket keep this case in mind, its IMP.
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	public static void preorder(bTreeNode<Integer> root) {
		if(root==null) { // Sanket keep this case in mind, its IMP.
			return;
		}
		System.out.print(root.data+" "); // just change the location syso() both in-order , pre-order and post-order are closely related.
		preorder(root.left);
		preorder(root.right);
		
	}
	public static void postorder(bTreeNode<Integer> root) {
		if(root==null) { // Sanket keep this case in mind, its IMP.
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" "); // just change the location syso() both in-order, pre-order and post-order are closely related.
	}
	
	public static void main(String[] args) {
		bTreeNode<Integer> root=inputLevelwise();	
		inorder(root);
		System.out.println();
		preorder(root);
		System.out.println();
		postorder(root);
	}
}