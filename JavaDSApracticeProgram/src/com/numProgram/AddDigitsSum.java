package com.numProgram;

public class AddDigitsSum {

	public static int addDigits(int num) {

		for (int i = 0; i <= num; i++) {
			int digitSum = 0;
			while (num > 0) {
				digitSum += num % 10;
				num /= 10;
			}
			num = digitSum;
		}
		return num;

	}

	public static void main(String[] args) {
		int num1 = 38;
		int result1 = addDigits(num1);
		System.out.println("Input: " + num1);
		System.out.println("Output: " + result1);
	}
}
