package com.module.basics;

import java.lang.reflect.Method;
import java.util.Scanner;

//Just to see the changes
public class BubbleSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lenght = scan.nextInt();
		scan.nextLine();
		int[] integerArray = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			integerArray[i] = scan.nextInt();
		}
		bubbleSort(integerArray);
		scan.close();
		Method[] methods = BubbleSort.class.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m.toString());
		}
	}

	private static void bubbleSort(int[] integerArray) {
		int lenght = integerArray.length;
		int numberOfSwaps = 0;
		for (int i = 0; i < lenght; i++) {
			for (int j = 0; j < lenght - 1; j++) {
				if (integerArray[j] > integerArray[j + 1]) {
					int temp = integerArray[j];
					integerArray[j] = integerArray[j + 1];
					integerArray[j + 1] = temp;
					numberOfSwaps++;
				}
			}
		}

		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
		System.out.println("First Element: " + integerArray[0]);
		System.out.println("Last Element: " + integerArray[integerArray.length - 1]);
	}
}
