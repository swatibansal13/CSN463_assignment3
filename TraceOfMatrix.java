package assignment3;

import java.util.Scanner;

public class TraceOfMatrix {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		
        System.out.println("Enter order of square matrix.");
        int n = ob.nextInt();
        
        System.out.println("Enter the elements in the matrix.");
        int arr[][] = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=ob.nextInt();
            }
        }
        
        System.out.println("The matrix entered is-");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       
        System.out.println("The trace of the matrix is " + trace(arr));

	}
	
	public static int trace(int arr[][]) {
		
		int trace = 0;
        for(int i=0; i<arr.length; i++)
        {
            trace = trace + arr[i][i];
        }
        
        return trace;
		
	}

}
