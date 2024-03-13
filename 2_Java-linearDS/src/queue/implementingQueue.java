package queue;

import java.util.Scanner;

public class implementingQueue {

	// Here I will implement a Dynamically growing queue.
	int Age[]=null;
	int front=-1, back=-1;
	public void makeArray() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array: ");
	int size=sc.nextInt();	
	Age=new int[size];
	}
	public void growTheArray() {
		System.out.println("Stack Size "+Age.length+" reached, Increasing to "+Age.length*2);
		int[] NewAry=new int[Age.length*2]; // I am basically making the array 2 times original.
		int j=0;
		for(int i=front; i<Age.length; i++) {
			NewAry[j]=Age[i]; // Copied elements from old array to new array.
			j++;
		}
		Age=NewAry; // Assigned new array to old array.
	}
	
	public void printAll() {
		if(front==-1 && back==-1) {
			System.out.println("No element to print");
			return;
		}
		for(int i=front; i<=back; i++) {
			System.out.println(Age[i]+",");
		}
	}
	
	public void push(int val) {
		if(back==Age.length-1) {
			growTheArray();
		}
		if(front!=-1) {
		++back;
		Age[back]=val;
		}
		else {
			++front;
			++back;
			Age[back]=val;			
		}
	}
	public void peek() {
		if(front<=back) {
			System.out.println("Value at Front is: "+Age[front]);
		}
		else {
			System.out.println("Queue is Empty");
		}
	}
	public void pop(){
		if(front<=back) {
			++front;	
		}
		else {
			System.out.println("Queue is Empty");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		implementingQueue obj=new implementingQueue();
		obj.makeArray();
		int what=0;
		
		while(what!=-1) {
			System.out.println("1:push 2:pop 3:peek 4:print-all    -1:STOP");
			what=sc.nextInt();
			switch (what){
			
			case 1:
				System.out.println("Value to push: ");
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