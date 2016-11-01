package com.module.basics;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.nextLine();
		int spaces = 0;
		for (int i = 1; i <= number; i++) {
			spaces = number - i;
			for (int k = 0; k < spaces; k++) {
				System.out.print(" ");
			}
			for (int l = 0; l < i; l++) {
				System.out.print("#");
			}
			System.out.println();
		}
		scan.close();
	}
}
