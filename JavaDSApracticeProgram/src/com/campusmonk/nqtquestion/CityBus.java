package com.campusmonk.nqtquestion;

public class CityBus {

	    public static int getFare(String source, String destination) {
	        String[] busStops = {"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};
	        int[] path = {800, 600, 750, 900, 1400, 1200, 1100, 1500};

	        // Find the index positions of source and destination stops
	        int sourceIndex = -1;
	        int destinationIndex = -1;
	        for (int i = 0; i < busStops.length; i++) {
	            if (busStops[i].equals(source)) {
	                sourceIndex = i;
	            }
	            if (busStops[i].equals(destination)) {
	                destinationIndex = i;
	            }
	        }

	        // Calculate total distance covered on the route from source to destination
	        int totalDistance = 0;
	        if (sourceIndex < destinationIndex) {
	            for (int i = sourceIndex; i < destinationIndex; i++) {
	                totalDistance += path[i];
	            }
	        } else {
	            for (int i = sourceIndex; i < busStops.length; i++) {
	                totalDistance += path[i];
	            }
	            for (int i = 0; i < destinationIndex; i++) {
	                totalDistance += path[i];
	            }
	        }

	        // Calculate the fare based on the total distance
	        int fare = (int) Math.ceil((double) totalDistance / 1000) * 5;

	        return fare;
	    }

	    public static void main(String[] args) {
	        String sourceStop = "NI";
	        String destinationStop = "HA";

	        int fare = getFare(sourceStop, destinationStop);
	        System.out.println("The fare from " + sourceStop + " to " + destinationStop + " is " + fare + " INR.");
	    }
	}

