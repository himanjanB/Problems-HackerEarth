package com.module.algorithms;

import java.util.Scanner;

//Testing

public class MergeSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Length of the array: ");
		int length = scan.nextInt();
		System.out.println("Enter the numbers of the array");
		int[] array = new int[length];

		for (int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
		}
		int[] sortedArray = mergeSort(array);
		printArray(sortedArray);
		scan.close();
	}

	private static void printArray(int[] sortedArray) {
		for (Integer i : sortedArray) {
			System.out.print(i + " ");
		}
	}

	private static int[] mergeSort(int[] array) {
		System.out.println("Size of input array in method is " + array.length);
		// System.out.println("In mergeSort");
		if (array.length == 1) {
			System.out.println("Returning as size of array is 1.");
			return array;
		}

		int[] firstHalfArray = new int[array.length / 2];
		int[] secondHalfArray = new int[array.length - (array.length / 2)];

		for (int i = 0; i < (array.length / 2); i++) {
			firstHalfArray[i] = array[i];
			System.out.println("Loop running for " + (i + 1) + " time");
		}

		for (int i = 0; i < (array.length - (array.length / 2)); i++) {
			secondHalfArray[i] = array[(array.length / 2) + i];
			System.out.println("Loop running for " + (i + 1) + " time");
		}

		firstHalfArray = mergeSort(firstHalfArray);
		secondHalfArray = mergeSort(secondHalfArray);

		return merge(firstHalfArray, secondHalfArray);
	}

	private static int[] merge(int[] firstHalfArray, int[] secondHalfArray) {
		int[] sortedArray = new int[firstHalfArray.length + secondHalfArray.length];

		while (firstHalfArray.length > 0 && secondHalfArray.length > 0) {
			System.out.println("Length of firstHalfArray is " + firstHalfArray.length);
			System.out.println("Length of secondHalfArray is " + secondHalfArray.length);
			/*
			 * if (firstHalfArray.length == 1) { System.exit(0); }
			 */
			if (firstHalfArray[0] > secondHalfArray[0]) {
				placeInLast(sortedArray, secondHalfArray[0]);
				remakeArray(secondHalfArray);
			} else {
				placeInLast(sortedArray, firstHalfArray[0]);
				remakeArray(firstHalfArray);
			}
		}

		while (firstHalfArray.length > 0) {
			placeInLast(sortedArray, firstHalfArray[0]);
			remakeArray(firstHalfArray);
		}

		while (secondHalfArray.length > 0) {
			placeInLast(sortedArray, secondHalfArray[0]);
			remakeArray(secondHalfArray);
		}

		return sortedArray;
	}

	private static void placeInLast(int[] sortedArray, int i) {
		int length = sortedArray.length;
		for (int k = length - 1; k > 0; k--) {
			sortedArray[k - 1] = sortedArray[k];
		}
		sortedArray[length - 1] = i;
	}

	private static void remakeArray(int[] inputArray) {

	}

}
