package com.basicInterviewProgram;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{4,7,8},{8,8,7}};
		
		int countOf7=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==7) {
					countOf7++;
				}
			}
		}
		System.out.println("count of 7 is :"+countOf7);
	}

}
