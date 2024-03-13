package binaryTree;

import java.util.*;
import java.util.Scanner;

public class bTreeUse_buildTree_InPre {

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
	

	private static bTreeNode<Integer> buildTree(int inOr[], int preOr[]) {
		
		return buildTreeHelper(inOr, preOr, 0, inOr.length-1, 0, preOr.length-1);

	}
	public static bTreeNode<Integer> buildTreeHelper(int inOr[],int preOr[], int is, int ie, int ps, int pe) {
		if(is>ie) {  // as this means our array is empty.
			return null;
		}
		int rootData=preOr[ps]; // This is recursion. we can't use 0. There will be many roots for each subtree.
		bTreeNode<Integer> root=new bTreeNode<>(rootData);
		
		// To find root node index in preorder.
		int rootInInorder=-1;
		for(int i=is; i<=ie; i++) { // as every time we make a root node. Preorder will loose 1st element.
			if(inOr[i]==rootData) { // thus we have to update it everytime.
				rootInInorder=i;
				break;
			}
		}
		if(rootInInorder==-1) { // Edge case.
			return null;
		}
		// Step 2 in my book to understand this. Do this and our Code is done.
		// Inorder calculations.
		int leftis=is;
		int leftie=rootInInorder-1;
		int rightis=rootInInorder+1;
		int rightie=ie;
		// Preorder calculation.
		int leftps=ps+1;
		int leftpe=leftie-leftis+leftps;
		int rightps=leftpe+1;
		int rightpe=pe;
		// This is basically just recursion. Its simple. Ignore it. 
		root.left=buildTreeHelper(inOr, preOr, leftis, leftie, leftps, leftpe);
		root.right=buildTreeHelper(inOr, preOr, rightis, rightie, rightps, rightpe);
		
		return root;
	}

	private static bTreeNode<Integer> bT(int inOr[], int preOr[]){
		
		return bth(inOr, preOr, 0, inOr.length-1, 0, preOr.length-1);
		
	}
	public static bTreeNode<Integer> bth(int[] inOr,int[] preOr,int is,int ie,int ps,int pe){
		if(is>ie) {
			return null;
		}
		
		int rootData=preOr[ps];
		int rootIndexIn=-1;
		bTreeNode<Integer> root=new bTreeNode<Integer>(rootData);
		for(int i=is; i<=ie; i++) {
			if(rootData==inOr[i]) {
				rootIndexIn=i;
			}
		}
		if(rootIndexIn==-1) {
			return null;
		}
		int leftis=is;
		int leftie=rootIndexIn-1;
		int rightis=rootIndexIn+1;
		int rightie=ie;
		
		int leftps=ps+1;
		int leftpe=leftie-leftis+leftps;
		int rightps=leftpe+1;
		int rightpe=pe;
		root.left=bth(inOr, preOr, leftis, leftie, leftps, leftpe);
		root.right=bth(inOr, preOr, rightis, rightie, rightps, rightpe);
		return root;
	}
	
	public static void main(String[] args) {
		
		int in[]= {4,2,5,1,3,7};
		int pre[]= {1,2,4,5,3,7};
		bTreeNode<Integer> root=buildTree(in,pre);
		System.out.println("My old");
		printLevelWise(root);
		
		System.out.println();
		
		bTreeNode<Integer> root1=bT(in,pre);
		System.out.println("My practice");
		printLevelWise(root1);
	}
}