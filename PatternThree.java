package com.riz.sample;

public class PatternThree {

	public static void main(String[] args) {
		int n = 14;

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (i+j<=(n-1)/2 || i-j>=(n-1)/2 || i==0 || i==n-1 || j==n-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
