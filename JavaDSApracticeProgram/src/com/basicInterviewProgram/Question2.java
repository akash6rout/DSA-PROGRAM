package com.basicInterviewProgram;

public class Question2 {

	public static void main(String[] args) {
		int arr[][]= {{1,4,9},{11,4,3},{2,2,3}};
		
		int sum=0;
		
		//sum of 2nd row elements
		for(int j=0;j<arr[0].length;j++) {
			sum+=arr[1][j];
		}
		System.out.println("sum is :"+sum);
	}
}
