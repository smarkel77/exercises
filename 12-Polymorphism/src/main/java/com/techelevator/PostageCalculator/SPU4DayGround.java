package com.techelevator.PostageCalculator;

public class SPU4DayGround implements DeliveryDriver{

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0;
		rate = (weight * 0.005) * distance;
		
		return rate;
	}

	@Override
	public String typeOfService() {
		// TODO Auto-generated method stub
		return "SPU 4-Day Ground";
	}
	
	

}
