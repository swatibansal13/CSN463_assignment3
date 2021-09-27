package assignment3;

import java.util.Scanner;

public class Determinant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Determinant of the matrix is : " + determinantOfMatrix(arr, n));

	}
	 
    public static void getCofactor(int mat[][], int temp[][], int p, int q, int n)
    {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){
                if (row != p && col != q){
                    temp[i][j++] = mat[row][col];
                    if (j == n - 1){
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    public static int determinantOfMatrix(int mat[][], int n)
    {
        int D = 0; 
        
        if (n == 1)
            return mat[0][0];
 
        int temp[][] = new int[n][n];
        int sign = 1;

        for (int f = 0; f < n; f++)
        {
            getCofactor(mat, temp, 0, f, n);
            D += sign * mat[0][f] * determinantOfMatrix(temp, n - 1);

            sign = -sign;
        }
 
        return D;
    }


}
