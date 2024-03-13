package Trees;

public class treeUse {

	public static void main(String[] args) {
		treeNode<Integer> rootNode=new treeNode<>(4);
		treeNode<Integer> node1=new treeNode<>(2);
		treeNode<Integer> node2=new treeNode<>(3);
		treeNode<Integer> node3=new treeNode<>(5);
		treeNode<Integer> node4=new treeNode<>(6); // Here we created the only nodes.
		
		rootNode.children.add(node1); // Now we will add nodes to root node.
		rootNode.children.add(node2);
		rootNode.children.add(node3);
		node2.children.add(node4); // Now we will add node to node2.
		
		System.out.println(rootNode);
		
	}
}