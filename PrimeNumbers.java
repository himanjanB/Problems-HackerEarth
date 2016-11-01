package com.module.basics;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numbers = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < numbers; i++) {
			int testNumber = scan.nextInt();
			String isPrime = isPrime(testNumber);
			System.out.println(isPrime);
		}
		scan.close();
	}

	private static String isPrime(int testNumber) {
		if(testNumber == 1){
			return "Not prime";
		}
		if (testNumber < 5) {
			return "Prime";
		} else {
			boolean flag = true;
			for (int i = 3; i < Math.sqrt(testNumber); i += 2) {
				if (testNumber % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return "Prime";
			} else {
				return "Not prime";
			}
		}
	}
}
