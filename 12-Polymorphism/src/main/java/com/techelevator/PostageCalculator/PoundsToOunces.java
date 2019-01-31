package com.techelevator.PostageCalculator;

public class PoundsToOunces {
	
	private double pounds;
	private double ounces;
	private static double totalOunces;
	
	public static double getTotalOunces (double pounds, double ounces) {
		pounds *= 16;
		totalOunces = ounces + pounds;
		return totalOunces;
		
	}
	
	public double getPounds() {
		return pounds;
	}
	public double getOunces() {
		return ounces;
	}
	
	

}
