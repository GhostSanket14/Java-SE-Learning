package binaryTree;

import java.util.Scanner;

public class bTreeUse_IPOP_recursively {
	
	public static bTreeNode<Integer> input(Scanner sc){
	
		System.out.println("Enter root data : ");
		int rootData=sc.nextInt();
		
		if(rootData==-1) { // This is our base case.
			return null;
		}
		// If user do want non-null tree we will use.
		bTreeNode<Integer> root=new bTreeNode<>(rootData);
		root.left=input(sc); // We dont have to ask user child. As there are always two. So just call the same function
		root.right=input(sc); // for left and right. So if user dont want anything on left or right / left & right, we we will return null.
		
		return root;
	}
	
	public static void print(bTreeNode<Integer> root) {
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
		print(root.left); // Finally we will do this for all L and R until null on all sides is reached. 
		print(root.right);
	}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		bTreeNode<Integer> root=input(sc);
		print(root);
	}
}