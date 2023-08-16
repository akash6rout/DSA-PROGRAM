package com.array;

public class BubbleSort {
	
	public static void bubbleSort(int arr[])
	{
		int size=arr.length;
		int temp=0;
		for(int i=0;i<size;i++)
		{
			for(int j=1;j<(size-1);j++)
			{
				if(arr[j-1]>arr[j])
				{
					//swap elements
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {3,60,35,2,45,320,5};
		
		System.out.println("Array Before Bubble Sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		bubbleSort(arr);
		
		System.out.println("Array After Bubble Sort");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
