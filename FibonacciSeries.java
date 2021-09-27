package assignment3;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
        System.out.println(fib(n));

	}
	
	 public static int fib(int n) {

	    int fibo[] = new int[n+2]; 
	    int i;

	    fibo[0] = 0;
	    fibo[1] = 1;
	     
	    for (i = 2; i <= n; i++) {
	        fibo[i] = fibo[i-1] + fibo[i-2];
	    }
	      
	    return fibo[n];
	 }

}
