package binaryTree;

import java.util.*;
import java.util.Scanner;

public class bTreeUse_diameter {
	
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
	
	// Tree Diameter. but code is slow.
	public static int treeDiameter(bTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int option1=height(root.left)+height(root.right);
		int option2=treeDiameter(root.left);
		int option3=treeDiameter(root.right);
		return Math.max(option1, Math.max(option2, option3));
	}
	public static int height(bTreeNode<Integer> root) {
		if(root==null) {
		return 0;
		}
		
		int lh=height(root.left);
		int rh=height(root.right);
		return 1+Math.max(lh, rh);
	}
	
	
	public static pair<Integer, Integer> heightDiameter(bTreeNode<Integer> root){ 
		if(root==null) {
			pair<Integer, Integer> output=new pair<>();
			output.first=0;
			output.second=0;
			return output;
		}
		// This is only recursion part.
		pair<Integer, Integer> lop=heightDiameter(root.left); // This will give us height & diameter of left. 
		pair<Integer, Integer> rop=heightDiameter(root.right); // height and diameter of right.
		
		// This part is constant.
		int height=1+Math.max(lop.first, rop.first);
		int option1=lop.first+rop.first;
		int option2=lop.second;
		int option3=rop.second;
		int diameter=Math.max(option1, Math.max(option2, option3));
		pair<Integer, Integer> output=new pair<>();
		output.first=height;
		output.second=diameter;
		return output;
	}

	
	
	public static void main(String[] args) {
		bTreeNode<Integer> root=inputLevelwise();
//		printRecursive(root);
		System.out.println();
		printLevelWise(root);
//		System.out.println("Diameter Method 1 is: "+treeDiameter(root));
		System.out.println("Diameter Method 2 is: "+heightDiameter(root).second);
	}
}