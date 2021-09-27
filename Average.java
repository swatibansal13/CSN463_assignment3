package assignment3;

import java.util.Arrays;

public class Average {

	public static void main(String[] args) {
		int arr[] = { 23, 6, 47, 35, 2, 14 };
		System.out.println("Average of all numbers in array: " + average(arr));
		System.out.println("Second largest element in array: " + secondLargest(arr));
		printOddNumbers(arr);
	}
	
	public static int average (int arr[]) {
		int sum = 0;
		int n = arr.length;
		
		for(int c:arr)
			sum = sum + c;
		
		return sum/n;
	}
	
	public static int secondLargest(int arr[]) {
		int n = arr.length;
		Arrays.sort(arr);
		return arr[n-2];
	}
	
	public static void printOddNumbers(int arr[]) {
		
		System.out.print("Odd elements in array: ");
		for(int c : arr) {
			if(c % 2 != 0)
				System.out.print(c + " ");
		}
	}

}
