package com.campusmonk.nqtquestion;

public class ValidStringDifference {
	
	    public static int findDifference(String s) {
	        int starCount = 0;
	        int hashCount = 0;
	        
	        for (char c : s.toCharArray()) {
	            if (c == '*') {
	                starCount++;
	            } else if (c == '#') {
	                hashCount++;
	            }
	        }
	        
	        int difference = starCount - hashCount;
	        
	        if (difference > 0) {
	            return difference;
	        } else if (difference < 0) {
	            return -difference;
	        } else {
	            return 0;
	        }
	    }

	    public static void main(String[] args) {
	        String inputString = "###***";
	        int output = findDifference(inputString);
	        System.out.println(output);
	    }
	}

