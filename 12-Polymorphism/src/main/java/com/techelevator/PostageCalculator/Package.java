package com.techelevator.PostageCalculator;

public class Package {
	
	private double weight;
	private int distance;
	
	public Package (double weight, int distance) {
		this.weight = weight;
		this.distance = distance;
	}
	
	
	public double getWeight() {
		return weight;
	}
	public int getDistance() {
		return distance;
	}
	
	

}
