package assignment3;

import java.util.Scanner;

public class SymmetricOrSkewSymmetric {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		if (isSymmetric(arr, n))
			System.out.println( "Symmetric");
		
		else {
			if (isSkewSymmetric(arr, n))
				System.out.println( "Skew-Symmetric");
			else
				System.out.println ( "Niether symmetric nor skew symmetric");
		}
			
	}
	
	static int  MAX = 100;
	 
	public static void transpose(int arr[][], int tr[][], int N)
	{
	    for (int i = 0; i < N; i++)
	        for (int j = 0; j < N; j++)
	            tr[i][j] = arr[j][i];
	}
	 
	public static boolean isSymmetric(int arr[][], int N)
	{
	    int tr[][] = new int[N][MAX];
	    transpose(arr, tr, N);
	    for (int i = 0; i < N; i++)
	        for (int j = 0; j < N; j++)
	            if (arr[i][j] != tr[i][j])
	                return false;
	    return true;
	}
	
	public static boolean isSkewSymmetric(int arr[][], int N)
	{
	    int tr[][] = new int[N][MAX];
	    transpose(arr, tr, N);
	    for (int i = 0; i < N; i++)
	        for (int j = 0; j < N; j++)
	            if (arr[i][j] != -tr[i][j])
	                return false;
	    
	    return true;
	}

}
