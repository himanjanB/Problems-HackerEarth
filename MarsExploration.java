package com.module.basics;

import java.util.Scanner;

public class MarsExploration {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String wordRecieved = scan.nextLine();
		int numberOfLettersDamaged = getMisplacedLetters(wordRecieved);
		System.out.println(numberOfLettersDamaged);
		scan.close();
	}

	// SOSOOSOSOSOSOSSOSOSOSOSOSOS
	private static int getMisplacedLetters(String wordRecieved) {
		int number = 0;
		if (wordRecieved.length() % 3 == 0) {
			char[] tempArray = wordRecieved.toCharArray();
			char[] referenceArray = { 'S', 'O', 'S' };
			int i = 0;
			while (i < tempArray.length - 2) {
				if (tempArray[i] != referenceArray[0]) {
					number++;
				}
				if (tempArray[i + 1] != referenceArray[1]) {
					number++;
				}
				if (tempArray[i + 2] != referenceArray[2]) {
					number++;
				}
				i += 3;
			}
		}
		return number;
	}
}
