package com.techelevator.PostageCalculator;

public class PoundsToOunces {
	
	private double pounds;
	private double ounces;
	
	
	
	public static double getTotalOunces (double pounds, double ounces) {
		double totalOunces;
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
