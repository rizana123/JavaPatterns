package com.riz.sample;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 56, 78, 34, 23, 45, 67, 90 };
		System.out.println("Printing array before sorting");
		printArray(arr);

		divideElements(arr);
		System.out.println("Printing array after sorting");
		printArray(arr);

	}

	private static void divideElements(int[] arr) {
		int arrayLength = arr.length;

		if (arrayLength <= 1) {
			return;
		}
		int mid = arrayLength / 2;
		int leftArray[] = new int[mid];
		int rightArray[] = new int[arrayLength - mid];

		for (int i = 0; i < mid; i++) {
			leftArray[i] = arr[i];
		}

		for (int i = mid; i < arrayLength; i++) {
			rightArray[i - mid] = arr[i];
		}

		divideElements(leftArray);
		divideElements(rightArray);
		mergesort(arr, leftArray, rightArray);
	}

	private static void mergesort(int[] sortedArray, int[] leftArray, int[] rightArray) {

		int leftArrayLenght=leftArray.length;
		int rightArrayLenght=rightArray.length;
		
		int i=0,j=0,k=0;
		
		while(i<leftArrayLenght && j<rightArrayLenght) {
			if(leftArray[i]<rightArray[j]) {
				sortedArray[k]=leftArray[i];
				i++;
			}
			else {
				sortedArray[k]=rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i<leftArrayLenght) {
			sortedArray[k]=leftArray[i];
			k++;
			i++;
		}
		
		while(j<rightArrayLenght) {
			sortedArray[k]=rightArray[j];
			k++;
			j++;
		}
		
	}

	private static void printArray(int arr[]) {

		for (int el : arr) {
			System.out.print(el + "  ");
		}
		System.out.println();
	}

}
