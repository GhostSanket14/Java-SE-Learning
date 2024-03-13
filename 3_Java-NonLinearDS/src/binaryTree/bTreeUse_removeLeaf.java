package binaryTree;

import java.util.*;
import java.util.Scanner;

public class bTreeUse_removeLeaf {
	
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
	
	public static bTreeNode<Integer> removeLeaf(bTreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		if(root.left==null && root.right==null) { // This will detect leaf node. And will return null.
			return null; // null returned here will be updated to root. Thus removing the leaf.
		}
		
		root.left=removeLeaf(root.left); // This will update our node above the leaf nodes.
		root.right=removeLeaf(root.right);
		
		return root;
	}
	
	public static void main(String[] args) {
		bTreeNode<Integer> root=inputLevelwise();
		printLevelWise(root);
		
		System.out.println("------------");
		
		bTreeNode<Integer> rootNew=removeLeaf(root);
		printLevelWise(rootNew);
	}
}