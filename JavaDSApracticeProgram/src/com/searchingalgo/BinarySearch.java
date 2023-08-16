package com.searchingalgo;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 7, 12, 14, 16, 17, 19, 20, 24, 28 };

		int srch = 5;
		int li = 0;
		int hi = arr.length - 1;
		int mi = (li + hi) / 2;

		while (li <= hi) {
			if (arr[mi] == srch) {
				System.out.println("Element is at" + mi + "index position");
				break;
			} else if (arr[mi] < srch) {
				li = mi + 1;
			} else {
				hi = mi + 1;
			}mi=(li+hi)/2;
		}
		if (li > hi) {
			System.out.println("element not found");
		}
	}

}
