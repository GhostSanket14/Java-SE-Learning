package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BST_class { // We wont make this Generic, as this is only for 'int' data by default.

	private bstNode<Integer> root; // we will always have a pointer to root and private root that only this class can access. 
	
	private bstNode<Integer> insertDataHelper(int data, bstNode<Integer> root) {
		if(root==null) {
			bstNode<Integer> newNode=new bstNode<Integer>(data);
			return newNode;
		}
		if(data<root.data) { // Insert smaller data on left.
			root.left=insertDataHelper(data, root.left);
		}
		else { // Insert larger or equal data on right.
			root.right=insertDataHelper(data, root.right);
		}
		
		return root;
	}
	public void insertData(int data) {
		root= insertDataHelper(data, root); // Root may get changed,  so we have to update it.
	}

	private bstNode<Integer> deleteDataHelper(int data, bstNode<Integer> root) {
		if(root==null) {
			return null;
		}
		if(data<root.data) {
			root.left=deleteDataHelper(data, root.left);
			return root;
		}else if(data>root.data) {
			root.right=deleteDataHelper(data, root.right);
			return root;
		}else { // When we reach the root, which have the data, we want to delete.
			if(root.left==null && root.right==null) { // For single/leaf node. Case 1
				return null;
			}else if(root.left==null) { // case 2
				return root.right;
			}else if(root.right==null) { // case 3
				return root.left;
			}else { // Case 4, unique. When we are trying to delete node which has node on L and R. 
				bstNode<Integer> minNode=root.right; // For now we will assume, right is min node.(actually it is max, as it is on right side of root. but we will search on left side.)
				while(minNode.left!=null) {
					minNode=minNode.left; // Basically we are searching for min element on right side of tree. 
				}						// And as per BST it is always on left of root.right node.
				root.data=minNode.data; // We asigned min node data to root.
				root.right=deleteDataHelper(minNode.data, root.right);	// then we deleted that node.
				
				return root;
			}
		}
	}
	public void deleteData(int data) {
		root= deleteDataHelper(data, root);
	}

	private boolean searchDataHelper(int data, bstNode<Integer> root) { // this root is local btw.
		boolean ans=false;
		if(root==null) {
			return false;
		}
		if(root.data==data) {
			return true;
		}
		if(data<root.data) {
			ans=searchDataHelper(data, root.left);
		}
		if(data>root.data) {
			ans=searchDataHelper(data, root.right);
		}
		return ans;
	}
	public boolean searchData(int data) {
		return searchDataHelper(data, root); // This is global private root from above.
	}

	public void printLevel(bstNode<Integer> root) {
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
	public void printLvl() {
		printLevel(root);
	}
	
}