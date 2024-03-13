
package Trees;

import java.util.ArrayList;

public class treeNode<T> {
	public T data;
	public ArrayList<treeNode<T>> children; // Here meaning of treeNode<T> is that, if parent is of data type T
									 // then children will also be of same data type. 
						             // Now ever time a new treeNode is created it will be of T type and stored in children.
	public treeNode(T data) {
		this.data = data;
		children = new ArrayList<>(); // keep in mind this little difference.
	}
}