package assignment3;

import java.util.Scanner;

public class Create2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of rows: ");
		int n = sc.nextInt();
		int arr[][] = new int[n][];
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Enter no of columns in row " + i + " :");
			int m = sc.nextInt(); 
			arr[i] = new int[m];
			
			System.out.println("Enter element of row " + i + " :");
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}

