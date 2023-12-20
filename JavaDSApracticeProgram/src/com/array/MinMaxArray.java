package com.array;

public class MinMaxArray {
	
	public static int minimunArray(int arr[]) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE; 
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Biggest value is==>"+max);
		return min;
	}
	/*public static int maxvalue(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}*/

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		System.out.println(minimunArray(arr));
		//System.out.println(maxvalue(arr));
	}
}
