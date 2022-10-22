package com.riz.sample;

public class PatternIneuron {

	public static void main(String[] args) {

		int n = 6;

		for (int j = 0; j < n; j++) {
			// Code for Pattern I
			for (int i = 0; i < n; i++) {
				if (i == n / 2 || j == 0 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			// Code for Pattern N
			for (int i = 0; i < n; i++) {
				if (i == 0 || i == n - 1 || j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			// Code for Pattern E
			for (int i = 0; i < n; i++) {
				if (i == 0 || j == 0 || j == n / 2 || j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			// Code for Pattern U
			for (int i = 0; i < n; i++) {
				if ((j == n - 1 && i > 0 && i < n - 1) || (i == 0 && j < n - 1) || (i == n - 1 && j < n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			// Code for Pattern R
			for (int i = 0; i < n; i++) {
				if ((j == 0 && i < n - 1) || i == 0 || (i == n - 1 && j < n / 2 && j > 0) || (j == n / 2 && i < (n - 1))
						|| (j > n / 2 && j - i + j == n)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			// Code for Pattern O
			for (int i = 0; i < n; i++) {
				if ((j == 0 && i > 0 && i < n - 1) || (i == 0 && j > 0 && j < n - 1)
						|| (i == n - 1 && j < n - 1 && j > 0) || (j == n - 1 && i < n - 1 && i > 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			// Code for Pattern N
			for (int i = 0; i < n; i++) {
				if (i == 0 || i == n - 1 || j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");

			System.out.println();

		}
	}
}
