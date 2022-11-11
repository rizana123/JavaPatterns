package com.riz.sample;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Range of input");
		int range = scanner.nextInt();
		int a[] = new int[range];
		System.out.println("Enter your numbers one by one of Range :"+range);
		for (int i = 0; i < range; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j < a.length - i; j++) {

				if (a[j] < a[j - 1]) {
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;

				}
			}
		}

		for (int el : a) {
			System.out.print(el + " ");
		}
		
		scanner.close();
	}

}
