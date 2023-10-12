package com.apnaclg.Array;

import java.util.Arrays;

public class LonelyNumber {
	public static void main(String[] args) {
		int arr[]= {4,5,6,8,10,13,15};
		int n=arr.length;
		printLonelyNumber(arr, n);
	}

	public static void printLonelyNumber(int arr[],int n)
	{
		Arrays.sort(arr);
		
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				if(arr[i+1]-arr[i]>1)
				{
					System.out.println(arr[i]);
				}
			}
			else if(i==n-1){
				 if(arr[i]-arr[i-1]>1)
				 {
					 System.out.println(arr[i]);
				 }
			}
			else {
				if(arr[i+1]-arr[i]>1 && arr[i]-arr[i-1]>1)
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
}
