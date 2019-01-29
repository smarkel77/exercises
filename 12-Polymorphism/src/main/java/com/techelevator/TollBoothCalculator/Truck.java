package com.techelevator.TollBoothCalculator;

public class Truck implements Vehicle {
	
	private int numberOfAxles;
	
	public Truck(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}
	
	public double calculateToll(int distance) {
		double toll;
		if (numberOfAxles == 4) {
			toll = distance * 0.040;
		} else if (numberOfAxles == 6) {
			toll = distance * 0.045;
		} else {
			toll = distance * 0.048;
		}
		return toll;
		
	}
	
	public String vehicleName() {
		if (numberOfAxles == 4) {
			return "Truck with 4 axles";
		} else if (numberOfAxles == 6) {
			return "Truck with 6 axles";
		} else {
			return "Truck with 8 or more axles";
		}
	
	}

	public int getNumberOfAxles() {
		return numberOfAxles;
	}

}
