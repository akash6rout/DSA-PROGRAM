package com.apnaclg.SortingAlgo;

public class MergeSortAlgo {
	
	public static int binarySearching(int arr[],int key) {
		int start=0;int end=arr.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			//comaparisons
			if(arr[mid]==key) {
				return mid;
			}
			if(arr[mid]<key) {
				start = mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,10,12,14};
		int key=4;
		
		System.out.println(binarySearching(arr, key));
	}
}
