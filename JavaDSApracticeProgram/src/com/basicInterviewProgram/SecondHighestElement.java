package com.basicInterviewProgram;

import java.util.Arrays;

public class SecondHighestElement {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,5,6,7,4,3};
		
		Arrays.sort(arr);
		
		System.out.println("Second Highest Element in the Array =>"+arr[arr.length-2]);
	}

}
