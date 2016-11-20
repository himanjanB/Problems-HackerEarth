package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleGame {
	static int[] monkArray = null;
	static int[] _monkArray = null;

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] array = br.readLine().split(" ");
		int N = Integer.parseInt(array[0]);
		int M = Integer.parseInt(array[1]);
		String[] tempMonkArray = br.readLine().split(" ");
		String[] _tempMonkArray = br.readLine().split(" ");
		monkArray = getIntegerArray(tempMonkArray);
		_monkArray = getIntegerArray(_tempMonkArray);
		determineWinner(monkArray, _monkArray);

	}

	private static void determineWinner(int[] monkArray, int[] _monkArray) {
		int monkTotalScore = 0;
		for (Integer i : monkArray) {
			int f_x = fOfX(i, "Monk");
			int g_x = gOfX(i, "Monk");
			System.out.print("For: " + i + " " + f_x + " " + g_x);
			System.out.println();
			monkTotalScore += (f_x * g_x);
		}

		int _monkTotalScore = 0;
		for (Integer i : _monkArray) {
			int f_x = fOfX(i, "!Monk");
			int g_x = gOfX(i, "!Monk");
			System.out.print("For: " + i + " " + f_x + " " + g_x);
			System.out.println();
			_monkTotalScore += (f_x * g_x);
		}

		int difference = Math.abs(monkTotalScore - _monkTotalScore);
		if (monkTotalScore > _monkTotalScore) {
			System.out.println("Monk " + difference);
		} else if (_monkTotalScore > monkTotalScore) {
			System.out.println("!Monk " + difference);
		} else {
			System.out.println("Tie");
		}
	}

	private static int gOfX(Integer i, String string) {
		int count = 0;
		if (string.equalsIgnoreCase("Monk")) {
			for (int k = 0; k < _monkArray.length; k++) {
				if (_monkArray[k] > i) {
					count = _monkArray.length - k;
					break;
				}
			}
		} else {
			for (int k = 0; k < monkArray.length; k++) {
				if (monkArray[k] > i) {
					count = monkArray.length - k;
					break;
				}
			}
		}
		return count;
	}

	private static int fOfX(Integer i, String string) {
		int count = 0;
		if (string.equalsIgnoreCase("Monk")) {
			for (Integer k : _monkArray) {
				if (k < i) {
					count++;
				} else {
					break;
				}
			}
		} else {
			for (Integer k : monkArray) {
				if (k < i) {
					count++;
				} else {
					break;
				}
			}
		}
		return count;
	}

	private static int[] getIntegerArray(String[] array) {

		int[] tempArray = new int[array.length];
		int index = 0;
		for (String s : array) {
			tempArray[index] = Integer.parseInt(s);
			index++;
		}

		for (int i = 1; i < tempArray.length; i++) {
			int key = tempArray[i];
			int j = i - 1;
			while (j >= 0 && tempArray[j] > key) {
				tempArray[j + 1] = tempArray[j];
				j--;
			}
			tempArray[j + 1] = key;
		}
		printArray(tempArray);
		return tempArray;
	}

	private static void printArray(int[] tempArray) {
		for(Integer i : tempArray){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
