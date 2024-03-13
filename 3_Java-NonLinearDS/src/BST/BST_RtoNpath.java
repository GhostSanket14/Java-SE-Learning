package BST;
import java.util.*;


public class BST_RtoNpath {
	
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

	
	static ArrayList<Integer> pathRtoN=new ArrayList<>(); // I used external AL.
	// You can use Internal AL too. But as for me, this made lot more sense.
	// External Al gives us Root to Node. While Internal gives us Node to Root.
	public static boolean searchNodeAndsavePath(bstNode<Integer> root, int Key) {
		boolean val=false;
		if(root==null) {
			return false;
		}
		if(root.data==Key) {
		pathRtoN.add(root.data);
			return true;
		}
		if(Key>root.data) {
		pathRtoN.add(root.data); 
		val=searchNodeAndsavePath(root.right, Key);
		}
		else if(Key<root.data) {
		pathRtoN.add(root.data);
		val=searchNodeAndsavePath(root.left, Key);
		}
		return val; 
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("If you dont follow instructions. Wrong inputs will not be taken");
		bstNode<Integer> root=inputLevelWise();
		printLevel(root);
		
		System.out.println("Input value to search in BST: ");
		int Key=sc.nextInt();
		System.out.println("SEARCH (boolean): "+searchNodeAndsavePath(root, Key));
		System.out.println("Path of R to N is");
		for(int a:pathRtoN) {
			System.out.print(a+"->");
		}
		System.out.print("end");
		
	}
}