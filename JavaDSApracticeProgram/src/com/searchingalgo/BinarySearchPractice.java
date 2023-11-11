package com.searchingalgo;

public class BinarySearchPractice {
	
	public static int binSearch(int arr[],int key) {
		int start=0;
		int end=arr.length-1;
		int ans=-1;
		
		while(start<=end) {
			int mid=start+end/2;
			//case1
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {//4<8=true
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8};
		int n = arr.length;
		int target = 6;
		int ans = -1;
		int start = 0;
		int end = n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				ans = mid;
				break;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		System.out.println(ans);
		
	}
}
