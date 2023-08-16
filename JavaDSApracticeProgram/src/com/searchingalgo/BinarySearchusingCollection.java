package com.searchingalgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearchusingCollection {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Your Search Number");
			int search=scanner.nextInt();
			
			int arr[] = { 2, 5, 7, 12, 14, 16, 17, 19, 20, 24, 28 };
			
			ArrayList<Integer> list=new ArrayList<>();
			for(int i=0;i<=arr.length-1;i++)
			{
					list.add(arr[i]);	
					
			}
			
			System.out.println("list content is :"+list);
			
			int poition=Collections.binarySearch(list, search);
			
			System.out.println("position of value :"+poition);
		}
	}

}
