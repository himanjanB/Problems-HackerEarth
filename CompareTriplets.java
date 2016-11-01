package com.module.basics;

import java.util.Scanner;


//Testing
public class CompareTriplets {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String lineOne = scan.nextLine();
		String lineTwo = scan.nextLine();
		int[] lineOneArray = getIntegerArray(lineOne);
		int[] lineTwoArray = getIntegerArray(lineTwo);
		String result = getResult(lineOneArray, lineTwoArray);
		System.out.println(result);
		scan.close();
	}

	private static String getResult(int[] lineOneArray, int[] lineTwoArray) {
		int pointOne = 0;
		int pointTwo = 0;
		for(int i = 0; i < lineOneArray.length; i++){
			if(lineOneArray[i] > lineTwoArray[i]){
				pointOne++;
			} else if(lineOneArray[i] < lineTwoArray[i]){
				pointTwo++;
			}
		}
		return pointOne + " " + pointTwo;
	}

	private static int[] getIntegerArray(String lineOne) {
		String[] tempStringArray = lineOne.split(" ");
		int[] tempArray = new int[tempStringArray.length];
		for(int i = 0; i < tempStringArray.length; i++){
			tempArray[i] = Integer.parseInt(tempStringArray[i]);
		}
		return tempArray;
	}
}
