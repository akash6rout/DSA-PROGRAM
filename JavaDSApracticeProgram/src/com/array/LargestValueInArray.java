package com.array;

public class LargestValueInArray {
	public static int getLargestValue(int arr[])
	{
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				largest=arr[i];
			}if(smallest>arr[i])
			{
				smallest=arr[i];
			}
		}
		System.out.println("Smallest value is"+smallest);
		return largest;
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,6,3,5};
		System.out.println("Largest value is"+getLargestValue(arr));
		//System.out.println("Smallest value is"+getLargestValue(arr));
	}

}
