package com.Oper;

class GFG {

	// Main method
	public static void main (String[] args) {
		
		// Number to be shifted
		int x = 5;
		
		// Number of positions
		int n = 1;
		
		// Shifting x by n positions towards left using left shift operator
		int answer = x << n;
		
		// Print the number obtained after shifting x by n positions towards left
		System.out.println("Left shift " + x + " by " + n + " positions : " + answer);
		
		// Number to be shifted
		x = answer;
		
		// Number of positions
		n = 2;
		
		// Shifting x by n positions towards left using left shift operator
		answer = answer << n;
		
		// Print the number obtained after shifting x by n positions towards left
		System.out.println("Left shift " + x + " by " + n + " positions : " + answer);
		
	}
}
