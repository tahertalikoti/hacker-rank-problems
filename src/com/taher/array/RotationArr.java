package com.taher.array;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Program to perform left rotation
 * @author taher
 */
public class RotationArr {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter length of array: ");
		int n = input.nextInt();

		int[] arr = new int[n];
		System.out.println("enter " + n + " array element:");
		for(int i = 0; i < n ; i++) {
			arr[i] = input.nextInt();	
		}
		
		System.out.print("enter no of left rotation: ");
		int d = input.nextInt();
		
		System.out.println("Before left rotation: " + Arrays.toString(arr));
		rotateArr(arr, 2);
		System.out.println("After left rotation : " + Arrays.toString(arr));
		
		
	}

	private static void rotateArr(int[] arr, int d) {

		for(int i = 0; i < d ; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
	}
}
