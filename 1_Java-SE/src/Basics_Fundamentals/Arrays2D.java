package Basics_Fundamentals;
import java.util.Scanner;

public class Arrays2D {
	
	int a=14;

	public static void main(String[] args) {
			int valAsindex[][]=new int[2][4];
			
			Scanner sc=new Scanner(System.in);	
			
			for(int i=0;i<valAsindex.length;i++) {
				for(int j=0;j<valAsindex[0].length;j++) {
					valAsindex[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<valAsindex.length;i++) {
				for(int j=0;j<valAsindex[0].length;j++) {
					System.out.print(valAsindex[i][j]);
				}
				System.out.println();
			}			
	}
}