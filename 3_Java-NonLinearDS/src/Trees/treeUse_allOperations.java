package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class treeUse_allOperations {

	public static treeNode<Integer> levelWiseInput(){
		Scanner sc=new Scanner(System.in);
		Queue<treeNode<Integer>> pendingNodes=new LinkedList<>();
		
		System.out.println("Enter root data ");
		int rootData=sc.nextInt();		 
		treeNode<Integer> root=new treeNode<>(rootData);
		
		pendingNodes.offer(root);
		
		while(!pendingNodes.isEmpty()) {
			
			treeNode<Integer> frontNode=pendingNodes.poll();
			
			System.out.println("Enter No. of children for "+frontNode.data);
			int childNo=sc.nextInt();
			for(int i=0; i<childNo; i++) {
				System.out.println("Enter "+(i+1)+"th child of "+frontNode.data); 
				int child=sc.nextInt();												
				treeNode<Integer> node=new treeNode<>(child); 
				frontNode.children.add(node); 
				pendingNodes.offer(node);
			}
		}
		
		return root;
				
	}
	
	// This is recursively. I will to level wise print later.
	public static void print(treeNode<Integer> root) {
		String s=root.data+": ";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	
	// Using Level wise IP-OP as base for, shown No. of nodes in tree.
	public static int nodeCount(treeNode<Integer> root) {
		if(root==null) { // IMP- this is not base case of out recursion. It is only here if we get a empty tree.
			return 0;
		}
		int count=1; // For every function call this 1 gets returned. and in the end gets added to the 
		
		for(int i=0;i<root.children.size();i++) { // This will effectively traverse the whole tree.
			count+= nodeCount(root.children.get(i)); 
		}
		
		return count;
	}
	
	public static int largetNodeData(treeNode<Integer> root) {
		if(root==null) { // Not base case
			return Integer.MAX_VALUE;
		}
		int ans=root.data;  // This will give us value of node once recursion reaches leaf nodes.
							// As below statement wont be executed thus we will get return.
		for(int i=0 ;i<root.children.size(); i++) {
			int childVal=largetNodeData(root.children.get(i));
			if(childVal>ans) {
				ans=childVal;
			}
		}
		return ans;		
	}
	
	public static int getHeight(treeNode<Integer> root){
        if (root == null) {
            return 0;
        }
        
        int max = 1;
        for (int i=0; i<root.children.size(); i++) {
        	
            int childHeight = 1 + getHeight(root.children.get(i)); // Basically we are adding 1 to variable when we go down a level.
           if(childHeight>max) {	// If will make sure, either Left or Right side of vale is taken (greater among them). And not addition of both.
            max = childHeight;
           }
            }
        return max;
	}
	
	public static int countLeafNodes(treeNode<Integer> root){

		// Write your code here
        
        if(root == null)
            return 0;
        
        int count = 0;
        if(root.children.size() == 0) { // Once we reach leaf this condition will get true and will calculate.
            count++;
        }
        for(int i=0; i<root.children.size(); i++) {
            count += countLeafNodes(root.children.get(i)); // We will keep going deep until no children.
        }
        return count;

	}
	
	public static void printAtK(treeNode<Integer> root, int k){
        if(k<0)	{ // To ignore negative value.
            return;
		}
        if(k == 0) {
            System.out.println("- "+root.data);
            return;
        }
        for(int i=0; i<root.children.size(); i++) {
        	printAtK(root.children.get(i), k-1);
        }
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		treeNode<Integer> root= levelWiseInput();
		print(root);
		System.out.println();
//		System.out.println(nodeCount(root));
		System.out.println(getHeight(root));
//		System.out.println(largetNodeData(root));
//		System.out.println(countLeafNodes(root));
//		printAtK(root, 2);
	}
}