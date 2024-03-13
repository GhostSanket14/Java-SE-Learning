package BST;

public class bstNode<T> {

	T data;
	public bstNode(T data) {
		this.data=data;
	}
	
	bstNode<T> right=null;
	bstNode<T> left=null;
}