package binaryTree;

public class bTreeUse {

	public static void main(String[] args) {
		bTreeNode<Integer> root=new bTreeNode<>(1); // We made a root node
		bTreeNode<Integer> node1=new bTreeNode<>(2); // we made a node
		bTreeNode<Integer> node2=new bTreeNode<>(3); // we made a node
		
		root.left=node1; // We attached 1 node to left side of our root.
		root.right=node2;// We attached 1 node to right side of our root.
		System.out.println("Debug till this line");
	}
}
//           1			
//			/\
//		   2  3
//	We made this tree.