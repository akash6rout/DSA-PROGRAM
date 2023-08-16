package com.Hashing;

import java.util.Arrays;
import java.util.Collections;

public class SortedArray {
	
	public static void printArr(Integer arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Integer arr[]= {2,5,6,8,1,3};
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		printArr(arr);

	}

}
