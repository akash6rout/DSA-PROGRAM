package com.array;

public class PrimeNoBetn1to100 {
	
	public static void main(String[] args) {
		
		for(int no=1;no<=100;no++) {
			int temp=0;
			for(int i=2;i<=no-1;i++) {
				if(no%i==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.println(no);
			}
		}
		//int no=7;
		/*for(int i=1;i<=100;i++) {
			int count=0;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					count=count+1;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}*/
	}

}
