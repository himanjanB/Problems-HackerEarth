package com.module.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IONChallengeOne {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfElements = Integer.parseInt(br.readLine());
		String[] array = br.readLine().split(" ");
		int[] integerArray = getIntegerArray(array);
		getSortedArray(integerArray);
		for(Integer i : integerArray) {
			System.out.print(i + " ");
		}
	}

	private static void sort(int low, int high, int[] integerArray) {
		int i = low, j = high;
		int pivot = Math.abs(integerArray[low + (high - low) / 2]);

		while (i <= j) {
			while (Math.abs(integerArray[i]) < pivot) {
				i++;
			}

			while (Math.abs(integerArray[j]) > pivot) {
				j--;
			}

			if (i <= j) {
				exchange(i, j, integerArray);
				i++;
				j--;
			}
		}
		if (low < j)
			sort(low, j, integerArray);
		if (i < high)
			sort(i, high, integerArray);
	}

	private static void exchange(int i, int j, int[] integerArray) {
		int temp = integerArray[i];
		integerArray[i] = integerArray[j];
		integerArray[j] = temp;
	}

	private static void getSortedArray(int[] integerArray) {
		int number;
		if (integerArray == null || integerArray.length == 0) {
			return;
		}
		number = integerArray.length;
		sort(0, number - 1, integerArray);
	}

	private static int[] getIntegerArray(String[] array) {
		int[] tempArray = new int[array.length];
		int index = 0;
		for (String s : array) {
			tempArray[index] = Integer.parseInt(s);
			index++;
		}
		return tempArray;
	}
}
