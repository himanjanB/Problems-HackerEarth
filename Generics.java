package com.module.basics;

public class Generics {
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3 };
		String[] strArray = { "Hello", "World" };

		printArray(intArray);
		printArray(strArray);

		if (Generics.class.getDeclaredMethods().length > 2) {
			System.out.println("No overloading allowed");
		}
	}

	private static void printArray(Object[] array) {
		for (Object o : array) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
}
