package com.campusmonk.nqtquestion;

public class WashingMachineFuzzySystem1 {
    public static String getTimeEstimate(int weight) {
        if (weight < 0 || weight > 7000) {
            return "INVALID INPUT";
        } else if (weight == 0) {
            return "Time Estimated: 0 minutes";
        } else if (weight <= 2000) {
            return "Time Estimated: 25 minutes"; // Low level water
        } else if (weight <= 4000) {
            return "Time Estimated: 35 minutes"; // Medium level water
        } else {
            return "Time Estimated: 45 minutes"; // High level water
        }
    }

    public static void main(String[] args) {
        int[] weights = {2000};
        
        for (int weight : weights) {
            String timeEstimate = getTimeEstimate(weight);
            System.out.println("Input value: " + weight);
            System.out.println("Output value: " + timeEstimate);
            System.out.println();
        }
    }
}

