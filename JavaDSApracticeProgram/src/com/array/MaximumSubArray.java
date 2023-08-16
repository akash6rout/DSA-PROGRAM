package com.array;

public class MaximumSubArray {

	public static void main(String[] args) {

		int arr[] = { 10,20 };//10

		int a=maximumSubArray(arr);
		System.out.println(a);
	}

	public static int maximumSubArray(int arr[]) {
		int max_Sum=0;
		int current_Sum = 0;

		for (int i = 1; i < arr.length; i++) {
			current_Sum = current_Sum + i;
			max_Sum = max_Sum + current_Sum;
		}

		return max_Sum;

	}

}
