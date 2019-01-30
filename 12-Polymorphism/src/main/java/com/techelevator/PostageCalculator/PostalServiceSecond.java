package com.techelevator.PostageCalculator;

public class PostalServiceSecond implements DeliveryDriver {

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0;

		if (weight <= 2) {
			rate = .0035 * distance;
		} else if (weight <= 8) {
			rate = .0040 * distance;
		} else if (weight <= 15) {
			rate = .0047 * distance;
		}else if (weight <= 48) {
			rate = .0195 * distance;
		}else if (weight <= 128) {
			rate = .045 * distance;
		}else  {
			rate = .05 * distance;
		}
		return rate;
	}

	@Override
	public String typeOfService() {
		// TODO Auto-generated method stub
		return "Postal Service (2nd Class)";
	}

}
