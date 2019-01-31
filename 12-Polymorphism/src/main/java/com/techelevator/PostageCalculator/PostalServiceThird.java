package com.techelevator.PostageCalculator;


public class PostalServiceThird extends PostalService implements DeliveryDriver {

	public PostalServiceThird () {
		super(0.0020, 0.0022, 0.0024, 0.0150 , 0.0160, 0.0170, "Postal Service (3rd Class)");
	}

}
