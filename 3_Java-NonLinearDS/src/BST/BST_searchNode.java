package BST;
import java.util.*;


public class BST_searchNode {
	
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
	
	// To return a value. use this Method
	public static int searchNode(bstNode<Integer> root, int Key) {
		int val=0;
		if(root==null) {
			return 0; // zero if we reach the end.
		}
		if(root.data==Key) {
			return 1; // 1 will be given only if value is found.
		}
		if(root.data<Key) {
		val+=searchNode(root.right, Key);
		}
		else if(root.data>Key) {
		val+=searchNode(root.left, Key);
		}
		return val; // This val will have 1 only if its found. 
	}
	
	// To return a Boolean. use this Method
	public static boolean searchNodeBoolean(bstNode<Integer> root, int Key) {
		boolean val=false; // Using this is optional. // See under main() for this version.
		if(root==null) {
			return false; // false if we reach the end.
		}
		if(root.data==Key) {
			return true; // true will be given only if value is found.
		}
		if(Key>root.data) {
		val=searchNodeBoolean(root.right, Key);
		}
		else if(Key<root.data) {
		val=searchNodeBoolean(root.left, Key);
		}
		return val; // This val will have true only if its found. 
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("If you dont follow instructions. Wrong inputs will not be taken");
		bstNode<Integer> root=inputLevelWise();
		printLevel(root);
		
		System.out.println("Input value to search in BST: ");
		int Key=sc.nextInt();
		System.out.println("SEARCH: "+searchNode(root, Key));

		System.out.println("SEARCH (boolean): "+searchNodeBoolean(root, Key));
	}
}


//public static boolean searchNodeBoolean(bstNode<Integer> root, int Key) {
//	if(root==null) {
//		return false; // false if we reach the end.
//	}
//	if(root.data==Key) {
//		return true; // true will be given only if value is found.
//	}
//	if(Key>root.data) {
//	searchNodeBoolean(root.right, Key);
//	}
//	else { // Java does allow us to use last most else as return. But dont allow same with if()
//	searchNodeBoolean(root.left, Key); // As you can see here.
//	} 
//}



