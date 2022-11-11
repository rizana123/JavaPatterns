package com.riz.sample;

import java.util.Scanner;

public class ArrayDuplicates {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Range of input");
		int range = scanner.nextInt();
		int a[] = new int[range];
		for (int i = 0; i < range; i++) {
			a[i] = scanner.nextInt();
		}

		for (int j = 0; j < a.length; j++) {

			for (int k = j + 1; k < a.length; k++) {
				if (a[j] == a[k]) {

					System.out.println("Duplicates found are :" + a[j]);
				}
			}
		}
		scanner.close();

	}

}
