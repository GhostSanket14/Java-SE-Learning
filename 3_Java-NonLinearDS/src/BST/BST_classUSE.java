package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BST_classUSE {
	public static void main(String args[]) {
		
		BST_class bst1=new BST_class();
		BST_class bst2=new BST_class();
		
		bst1.insertData(10);
		bst1.insertData(20);
		bst1.insertData(5);
		bst1.insertData(15);
		bst1.insertData(3);
		bst1.insertData(7);
		
		// Learn how to balance the tree later.
		bst2.insertData(1);
		bst2.insertData(2);
		bst2.insertData(3);
		bst2.insertData(4);
		bst2.insertData(5);
		bst2.insertData(6);
		
		System.out.println(bst1.searchData(3));
		System.out.println();
		bst1.printLvl();
		System.out.println("----------");
		bst2.printLvl();
		
	}
}