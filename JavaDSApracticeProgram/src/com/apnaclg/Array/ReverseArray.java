package com.apnaclg.Array;

public class ReverseArray {

	public static void reverse(int arr[]) {
		int i=0,j=arr.length-1;
		
		while(i<j) {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10};
		
		reverse(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
	}
}
