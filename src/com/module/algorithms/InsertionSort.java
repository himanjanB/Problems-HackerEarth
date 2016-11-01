package com.module.algorithms;

import java.util.Scanner;

public class InsertionSort {
	private static int counter = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Length of the array: ");
		int length = scan.nextInt();
		System.out.println("Enter the numbers of the array");
		int[] arrayOne = new int[length];
		int[] arrayTwo = new int[length];

		for (int i = 0; i < length; i++) {
			arrayOne[i] = scan.nextInt();
			arrayTwo[i] = 2 * arrayOne[i];
		}

		insertionSortOne(arrayOne);
		counter = 0;
		insertionSortTwo(arrayTwo);
		scan.close();
	}

	// Example input array 8 2 4 9 3 6
	// Output array should be 2 3 4 6 8 9

	private static void insertionSortOne(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j--;
				counter++;
			}
			array[j + 1] = key;
		}
		printArray(array);
		System.out.println();
		System.out.println("This input needed " + counter + " steps to complete.");
	}

	private static void insertionSortTwo(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (array[j + 1] < array[j]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					counter++;
				}
			}
		}
		printArray(array);
		System.out.println();
		System.out.println("This input needed " + counter + " steps to complete.");
	}

	private static void printArray(int[] array) {
		for (Integer i : array) {
			System.out.print(i + " ");
		}
	}
}
