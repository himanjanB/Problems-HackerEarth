package com.module.algorithms;

/*
 * The problem statement can be found at
 * http://stackoverflow.com/questions/24414700/amazon-water-collected-between-towers
 * 
 * Sample input						Sample Output
 * 1 5 3 7 2							2		
 * 5 3 7 2 6 4 5 9 1 2					14
 * 1 2 1 1 4 1 1 2 5 3 4				11
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LineTowerProblem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split(" ");
		int[] inputArray = getIntegerArray(array);
		int totalWaterContained = solveLineTowerProblem(inputArray);
		System.out.println(totalWaterContained);
		scan.close();
	}

	private static int solveLineTowerProblem(int[] inputArray) {
		int totalWaterContained = 0;
		int index;
		int currentIndex = 0;
		int countInBetween = 0;
		List<Integer> integerList = new ArrayList<Integer>();

		if (inputArray.length < 3) {
			return totalWaterContained;
		} else {
			for (index = 1; index < inputArray.length - 1;) {
				countInBetween = 0;
				integerList.clear();

				int tempIndex = index;
				boolean flag = false;

				while (inputArray[currentIndex] > inputArray[tempIndex] && tempIndex < inputArray.length - 1) {
					integerList.add(inputArray[tempIndex]);
					tempIndex++;
					countInBetween++;
					flag = true;
				}

				if (flag) {
					integerList.add(inputArray[index + countInBetween]);
					integerList.add(inputArray[index - 1]);

					int differnceBetweenHighest = min(integerList.get(integerList.size() - 2),
							integerList.get(integerList.size() - 1));
					int totalCapacity = differnceBetweenHighest * countInBetween;
					totalWaterContained += totalCapacity - sum(integerList);
				}
				index += countInBetween + 1;
				currentIndex = index - 1;
			}
		}
		return totalWaterContained;
	}

	private static int min(Integer integer, Integer integer2) {
		if (integer < integer2)
			return integer;
		else
			return integer2;
	}

	private static int sum(List<Integer> integerList) {
		int sum = 0;
		for (int i = 0; i < integerList.size() - 2; i++) {
			sum += integerList.get(i);
		}
		return sum;
	}

	private static int[] getIntegerArray(String[] array) {
		int[] tempArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = Integer.parseInt(array[i]);
		}
		return tempArray;
	}
}
