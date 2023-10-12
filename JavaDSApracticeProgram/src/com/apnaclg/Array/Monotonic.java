package com.apnaclg.Array;

public class Monotonic {
	
	public static boolean isIncreasing(int arr[],int n) {
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				return false;
			}
		}
		return true;
	}
	public static boolean isDecreasing(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				return false;
			}
		}
		return false;
	}
	
	public static boolean isMonotonic(int arr[],int n) {
		
		boolean isIncresing=isIncreasing(arr, n);
		boolean isDecreasing=isDecreasing(arr, n);
		
		return isDecreasing || isIncresing;
	}
	
	public static void main(String[] args) {
		
		//int arr[]= {1,2,3,4};
		int arr[]= {1,2,2,1};
		int n=arr.length;
		System.out.println(isMonotonic(arr, n));
	}

}
