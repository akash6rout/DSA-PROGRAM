package com.sg;

import java.util.Scanner;

public class FibbonacciSequence {

	        public static void main(String args[])
	                {
	                try (Scanner ss = new Scanner(System.in)) {
						System.out.println("Enter a number");
						int num=ss.nextInt();
						
						int d=1;
						
						int e=1;
						int a=0,b=1,c,i;
						for(i=2;i<=num;i++)
						        {
						        c=a+b;
						        if((d==b) && (e==c))
						                {
						                System.out.println("Yes");
						                }else{
						                a=b;
						                b=c;
						                }
						        }
					}
	                }
}
