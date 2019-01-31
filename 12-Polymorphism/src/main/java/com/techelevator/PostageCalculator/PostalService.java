package com.techelevator.PostageCalculator;

public class PostalService implements DeliveryDriver{
	
	private double ounces2;
	private double ounces8;
	private double ounces15;
	private double ounces48;
	private double ounces128;
	private double ouncesTopOut;
	private String name;
	
	
	public PostalService (double ounces2, double ounces8, double ounces15, double ounces48, double ounces128, double ouncesTopOut, String name) {
		this.ounces2 = ounces2;
		this.ounces8 = ounces8;
		this.ounces15 = ounces15;
		this.ounces48 = ounces48;
		this.ounces128 = ounces128;
		this.ouncesTopOut = ouncesTopOut;
		this.name = name;
	}
	
	
	public double calculateRate(int distance, double weight) {
		double rate = 0;
		
		if (weight <= 2) {
			rate = ounces2 * distance;
		}else if (weight <= 8) {
			rate = ounces8 * distance;
		}else if (weight <= 15) {
			rate = ounces15 * distance;
		}else if (weight <= 48) {
			rate = ounces48 * distance;
		}else if (weight <= 128) {
			rate = ounces128 * distance;
		}else  {
			rate = ouncesTopOut * distance;
		} 
		return rate;
	}


	@Override
	public String typeOfService() {
		
		return name;
	}

}
