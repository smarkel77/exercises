package com.techelevator.TollBoothCalculator;

public class Car implements Vehicle {
	
	private boolean hasTrailer;
	
	public Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}
	
	public double calculateToll(int distance) {
		double toll = distance * 0.020;
		if (!hasTrailer) {
			return toll;
		} else {
			toll = toll + 1;
		}
		return toll;
	}
	
	public String vehicleName() {
		if (!hasTrailer) {
			return "Car";
		}
		return "Car with trailer";
	}

	public boolean isHasTrailer() {
		return hasTrailer;
	}
	
}
