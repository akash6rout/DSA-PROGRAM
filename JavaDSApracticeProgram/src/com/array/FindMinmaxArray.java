package com.array;

import java.util.Arrays;

class Pair1{
	
	public int min;
	public int max;
	
}

public class FindMinmaxArray {
	
	static Pair1 getMinMax(int arr[],int n)
	{
		Pair1 minmax= new Pair1();
		Arrays.sort(arr);
		minmax.min=arr[0];
		minmax.max=arr[n-1];
		
		return minmax;
	}
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60}; 
		int arr_size=arr.length;
		Pair1 minmax=getMinMax(arr, arr_size);
		System.out.println(minmax.max);
		System.out.println(minmax.min);
	}
	
}
