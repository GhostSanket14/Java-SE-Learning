package BST;
import java.util.*;


public class BST_RtoNpathInternalAL {
	
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

	// Inter arrayist gives us, Node to Root.
	public static ArrayList<Integer> searchNodeAndsavePath(bstNode<Integer> root, int Key) {
		if(root==null) {
			return null;
		}
		if(root.data==Key) {
		ArrayList<Integer> actualNode=new ArrayList<>();
		actualNode.add(root.data);
			return actualNode; // At very first this will be returned to left or right.
		} // After this rest will keep returning till we reach the Root.
		if(Key>root.data) {
		ArrayList<Integer> rightSide=searchNodeAndsavePath(root.right, Key);
		rightSide.add(root.data);
		return rightSide;
		
		}
		else {
			ArrayList<Integer> leftSide=searchNodeAndsavePath(root.left, Key);
			leftSide.add(root.data);
		return leftSide;	
		}
	}
	
	public static ArrayList<Integer> nodeToRoot(bstNode<Integer> root, int key){
		if(root==null) {
			return null;
		}
		if(root.data == key) {
			ArrayList<Integer> output=new ArrayList<>();
			output.add(root.data);
			return output;
		}
		if(root.data<key) {
			ArrayList<Integer> rightCheck=nodeToRoot(root.right, key);
			rightCheck.add(root.data);
			return rightCheck;
		}else {
			ArrayList<Integer> leftCheck=nodeToRoot(root.left, key);
			leftCheck.add(root.data);
			return leftCheck;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("If you dont follow instructions. Wrong inputs will not be taken");
		bstNode<Integer> root=inputLevelWise();
		printLevel(root);
		
		System.out.println("Input value to search in BST: ");
		int Key=sc.nextInt();
		System.out.println("SEARCH (with Path): "+searchNodeAndsavePath(root, Key));
		System.out.println("SEARCH (with Path): "+nodeToRoot(root, Key));
	}
}