package com.techelevator.PostageCalculator;

public class SPU implements DeliveryDriver{
	
	private String name;
	private double shippingType;
	
	public SPU (double shippingType, String name) {
		this.name = name;
		this.shippingType = shippingType;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		double rate;
		rate = (weight * shippingType) * distance;
		return rate;
	}

	@Override
	public String typeOfService() {
		
		return name;
	}
	

}
