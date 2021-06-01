package com.taher.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr {
	
	public static void main(String[] args) {
		
		
//		Scanner scaner = new Scanner(System.in);
//		System.out.println("enter length of array: ");
//		int n = scaner.nextInt();
//		int[] arr = new int[n];
//		for(int i = 0; i < n ; i++) {
//			arr[i] = scaner.nextInt();
//		}
		
		
		int[] arr = {6676,3216,4063,8373,423,586,8850,6762};
		System.out.println("6762 8850 586 423 8373 4063 3216 6676");
		reverseArr(arr);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void reverseArr(int[] arr) {
		
		int n = arr.length;
		for(int i = 0; i < n/2 ; i++) {
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp; 
		}
	}
	
	

}
