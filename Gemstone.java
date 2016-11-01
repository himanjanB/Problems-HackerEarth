package com.module.basics;

import java.util.Scanner;

public class Gemstone {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfWords = scan.nextInt();
		scan.nextLine();
		String[] wordsArray = new String[numberOfWords];
		
		for(int i = 0; i < numberOfWords; i++){
			wordsArray[i] = scan.nextLine();
		}
		
		int gemNumber = getGemstoneNumber(wordsArray);
		System.out.println(gemNumber);
		scan.close();
	}

	private static int getGemstoneNumber(String[] wordsArray) {
		
		return 0;
	}

}
