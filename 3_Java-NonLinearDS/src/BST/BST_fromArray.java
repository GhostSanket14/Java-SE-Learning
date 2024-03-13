package BST;
import java.util.*;


public class BST_fromArray {
	
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
	
	private static bstNode<Integer> makebstFromArray(int[] arr, int start, int end) {
		if(start>end) { // When we reach the last element.
		return null;
		}
		int mid=(start+end)/2;
		bstNode<Integer> root=new bstNode<Integer>(arr[mid]);
		
		root.left=makebstFromArray(arr,start,mid-1);
		root.right=makebstFromArray(arr,mid+1,end);
		
		return root;		
	}
	
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
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array is : 1,2,3,4,5,6,7,8,9,10 ");
		bstNode<Integer> root=makebstFromArray(arr,0,arr.length-1);
		printLevel(root);
		System.out.println("Is my Tree balanced : "+isBSTbalanced(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
}