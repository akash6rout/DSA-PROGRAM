package com.campusmonk.nqtquestion;

public class WashingMachineFuzzySystem {
    public static int getTimeEstimate(int weight) {
        if (weight <= 0) {
            return 0;  // Zero weight
        } else if (weight <= 2000) {
            return 25; // Low level water
        } else if (weight <= 4000) {
            return 35; // Medium level water
        } else if (weight <= 7000) {
            return 45; // High level water
        } else {
            // Handle cases where weight exceeds machine capacity
            return -1; // Invalid weight
        }
    }

    public static void main(String[] args) {
        int[] weights = {2000};
        
        for (int weight : weights) {
            int timeEstimate = getTimeEstimate(weight);
            
            if (timeEstimate == -1) {
                System.out.println("Invalid weight: " + weight);
            } else {
                System.out.println("Weight: " + weight + " grams, Time Estimate: " + timeEstimate + " minutes");
            }
        }
    }
}

