package OOPs_X_All_below_combined;

public class protectedData {
	int a=1; // default is only accessible within package
	private int b=2; // private is only accessible within class
	public int c=3; // public is accessible everywhere
	protected int d=404; // protected can be accessed by any class that inherit it. Also by entire package it is created into.
	
	public int getB() {
		return b;
	}
}