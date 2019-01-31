package com.techelevator.PostageCalculator;

public class PostalServiceSecond extends PostalService implements DeliveryDriver {

	public PostalServiceSecond () {
		super(.0035, .0040, .0047, .0195, .045, .05, "Postal Service (2nd Class)");
	}
}
