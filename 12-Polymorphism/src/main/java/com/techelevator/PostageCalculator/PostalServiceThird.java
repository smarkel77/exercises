package com.techelevator.PostageCalculator;


public class PostalServiceThird implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		
		
		double rate = 0;

		if (weight <= 2) {
			rate = 0.0020 * distance;
		}else if (weight <= 8) {
			rate = .0022 * distance;
		}else if (weight <= 15) {
			rate = .0024 * distance;
		}else if (weight <= 48) {
			rate = .015 * distance;
		}else if (weight <= 128) {
			rate = .016 * distance;
		}else {
			rate = .017 * distance;
		}
		return rate;
	}

	@Override
	public String typeOfService() {
		// TODO Auto-generated method stub
		return "Postal Service (3nd Class)";
	}

}
