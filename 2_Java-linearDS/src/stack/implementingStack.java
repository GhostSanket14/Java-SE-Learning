package stack;

import java.util.Scanner;

// Here I have implemented a Dynamically growing stack. :)

public class implementingStack {

	int Age[]=null;
	int top=-1;
	
	public void makeArray() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of Stack: ");
	int size=sc.nextInt();	
	Age=new int[size];
	}
	
	public void growTheArray() {
		System.out.println("Stack Size "+Age.length+" reached, Increasing to "+Age.length*2);
		
		int[] NewAry=new int[Age.length*2]; // I am basically making the array 2 times original.
		
		for(int i=0; i<Age.length; i++) {
			NewAry[i]=Age[i]; // Copied elements from old array to new array.
		}
		Age=NewAry; // Assigned new array to old array.
	}
	
	public void printAll() {
		if(top==-1) {
			System.out.println("No element to print");
			return;
		}
		for(int i=top; i>=0; i--) {
			System.out.println(Age[i]+",");
		}
	}
	
	public void push(int val) {
		if(top==Age.length-1) {
			growTheArray();
		}
		++top;
		Age[top]=val;
	}
	public void peek() {
		if(top!=-1) {
			System.out.println("Value at top is: "+Age[top]);
		}
		else {
			System.out.println("Stack is Empty");
		}
	}
	public void pop(){
		if(top!=-1) {
			--top;	
		}
		else {
			System.out.println("Stack is Empty");
		}
	}
	
	public static void main(String[] args) {
		implementingStack obj=new implementingStack();
		Scanner sc=new Scanner(System.in);
		obj.makeArray();
		
		int what=0;
		
		while(what!=-1) {
			System.out.println("1:push 2:pop 3:peek 4:print-all    -1:STOP");
			
			what=sc.nextInt();
			
			switch (what){
			
			case 1:
				System.out.println("Enter Value to push: ");
				int val=sc.nextInt();
				obj.push(val);
				break;
			case 2:
				obj.pop();
				break;
			case 3:
				obj.peek();
				break;
			case 4:
				obj.printAll();
				break;
			case -1:
				what=-1;
				break;
			default:
				System.out.println("Please Enter from valid choices");
			}			
		}
		
		sc.close();
	}
}