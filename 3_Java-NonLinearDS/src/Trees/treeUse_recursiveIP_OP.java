package Trees;

import java.util.Scanner;

public class treeUse_recursiveIP_OP {

	
	public static treeNode<Integer> inputTree(Scanner sc){ // Since we are passing the scanner and re-making it in every call. out input will be fine.
														   //CN_Trees SS2 <- this issue wont happen. 
		System.out.println("Enter node");
		int n=sc.nextInt();
		treeNode<Integer> root=new treeNode<>(n); // First we will ask for root node.
		
		System.out.println("Enter children No. for node"+n); // Then we will ask how many child that node will have.
		int childNo=sc.nextInt();
		
		// Then we will call the function for each child.
		
		for(int i=0; i<childNo; i++) { // if no children then we directly return below.
			treeNode<Integer> child= inputTree(sc);
			root.children.add(child);
		}
		
		return root;
	}
	
	public static void print(treeNode<Integer> root) {
		String s=root.data+": ";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i)); // This way we will call print for each child one by one. Above will will not run if that root have no child.
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // To avoid input issue we will use same scanner and send via function call to be used.
		treeNode<Integer> root= inputTree(sc); // This function will take input and will return back root.
		print(root);
		
//		treeNode<Integer> rootNode=new treeNode<>(4);
//		treeNode<Integer> node1=new treeNode<>(2);
//		treeNode<Integer> node2=new treeNode<>(3);
//		treeNode<Integer> node3=new treeNode<>(5);
//		treeNode<Integer> node4=new treeNode<>(6); // Here we created the only nodes.
//		
//		rootNode.children.add(node1); // Now we will add nodes to root node.
//		rootNode.children.add(node2);
//		rootNode.children.add(node3);
//		node2.children.add(node4); // Now we will add node to node2.
//		
//		System.out.println(rootNode);
//		
	}
}