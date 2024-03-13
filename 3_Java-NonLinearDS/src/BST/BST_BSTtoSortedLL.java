package BST;
import java.util.*;


public class BST_BSTtoSortedLL {
	
	static List<Integer> head=new LinkedList<>(); // idk if this is cheating or not. But it works great.
	
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
	
		
	public static void bstToSortedLL(bstNode<Integer> root) {
		if(root==null) {
			return;
		}
		bstToSortedLL(root.left);
		head.add(root.data);
		bstToSortedLL(root.right);		
	}
	
	public static void printLL(List<Integer> head){
		List<Integer> tmp=head;
		int i=0;
		while(i<tmp.size()) {
			System.out.print(tmp.get(i)+" ");
			i++;
		}
	}
	
	public static void main(String[] args) {
		bstNode<Integer> root=inputLevelWise();
		bstToSortedLL(root);
		printLL(head);
	}
}