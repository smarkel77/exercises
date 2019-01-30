package com.techelevator.PostageCalculator;

public class PoundsToOunces {
	
	private Integer pounds;
	private Integer ounces;
	private Integer totalOunces;
	
	public Integer getTotalOunces (Integer pounds, Integer ounces) {
		pounds *= 16;
		totalOunces = ounces + pounds;
		return totalOunces;
		
	}
	
	public Integer getPounds() {
		return pounds;
	}
	public Integer getOunces() {
		return ounces;
	}
	
	

}
