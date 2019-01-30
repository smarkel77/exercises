package com.techelevator.PostageCalculator;

public class PostalServiceFirst implements DeliveryDriver{

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0;
		
		if (weight <= 2) {
			rate = .035 * distance;
		}else if (weight <= 8) {
			rate = .040 * distance;
		}else if (weight <= 15) {
			rate = .047 * distance;
		}else if (weight <= 48) {
			rate = .195 * distance;
		}else if (weight <= 128) {
			rate = .45 * distance;
		}else  {
			rate = .5 * distance;
		} 
		return rate;
	}

	@Override
	public String typeOfService() {
		
		return "Postal Service (1st Class)";
	}
	
	

}
