package com.apnaclg.Array;

public class MaximumSubArraySum {
	
	public static void maximumSubArraySumis(int arr[]) {
		int currSum=0;
		int maxSum=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			int start=i;
			for(int j=0;j<arr.length;j++) {
				int end=j;
				currSum=0;
				for(int k=start;k<=end;k++)
				{
					currSum=currSum+arr[k];
				}
				System.out.println(currSum);
				if(maxSum < currSum) {
					maxSum=currSum;
				}
			}
		}
		System.out.println("max sum is"+maxSum);
	}
	
	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10};
		
		maximumSubArraySumis(arr);
	}

}
