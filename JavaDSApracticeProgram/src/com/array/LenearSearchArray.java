package com.array;

import java.util.Scanner;

public class LenearSearchArray {
	
	public static int lenearSearch(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[]= {10,90,70,50,60,30,20};
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Your Number You Want to search::");
			int key=scanner.nextInt();
			int index=lenearSearch(arr, key);
			if(index == -1)
			{
				System.out.println("NOT FOUND");
			}else {
				System.out.println("key is at index of"+index);
			}
		}
	}

}
