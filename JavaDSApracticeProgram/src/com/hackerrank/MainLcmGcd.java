package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
public class MainLcmGcd {

	
	    public static void main(String[] args) {
	        List<Integer> a = new ArrayList<>();
	        a.add(2);
	        a.add(4);

	        List<Integer> b = new ArrayList<>();
	        b.add(16);
	        b.add(32);
	        b.add(96);

	        System.out.println(getTotalX(a, b)); // This will print the result
	    }

	    public static int getTotalX(List<Integer> a, List<Integer> b) {
	        int result = 0;

	        // Get lcm of all elements of a
	        int lcm = a.get(0);
	        for (Integer integer : a) {
	            lcm = getLCM(lcm, integer);
	        }

	        // Get gcd of all elements of b
	        int gcd = b.get(0);
	        for (Integer integer : b) {
	            gcd = getGCD(gcd, integer);
	        }

	        // Count multiples of lcm that divide the gcd
	        int multiple = lcm;
	        while (multiple <= gcd) {
	            if (gcd % multiple == 0) {
	                result++;
	            }
	            multiple += lcm;
	        }
	        return result;
	    }

	    // Helper method to calculate the greatest common divisor (GCD)
	    public static int getGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    // Helper method to calculate the least common multiple (LCM)
	    public static int getLCM(int a, int b) {
	        return (a * b) / getGCD(a, b);
	    }
	}

