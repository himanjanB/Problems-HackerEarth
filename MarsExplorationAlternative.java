package com.module.basics;

import java.util.Scanner;

public class MarsExplorationAlternative {
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
			StringBuffer referenceString = new StringBuffer();
			for (int i = 0; i < (wordRecieved.length() / 3); i++) {
				referenceString.append("SOS");
			}
			String refString = referenceString.toString();
			System.out.println(refString);
			char[] referenceArray = refString.toCharArray();
			for (int i = 0; i < tempArray.length; i++) {
				if (tempArray[i] != referenceArray[i]) {
					number++;
				}
			}
		}
		return number;
	}
}
