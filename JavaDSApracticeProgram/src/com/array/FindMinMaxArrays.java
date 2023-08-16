package com.array;

public class FindMinMaxArrays {

	public static void main(String[] args) {
		int arr[]= {1,5,6,7,9,4};
		findMinMax(arr);
	}
	static void findMinMax(int arr[])
	{
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max+"MAXMIMUM");
		System.out.println(min+"MINIMUM");
	}
}
