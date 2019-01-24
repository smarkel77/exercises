package com.techelevator.calculator;

public class Calculator {

	private int currentValue = 0;
	
	
	public int add(int addend) {
		return currentValue += addend;
	}
	
	
	public int multiply(int multiplier) {
		return currentValue *= multiplier;
	}
	public int subtract(int subtrahend) {
		return currentValue -= subtrahend;
	}
	public int power(int exponent) {
		for (int i = 0; i <= exponent; i++) {
			currentValue = currentValue * currentValue;
		}
		
		return currentValue;
	}
	public void reset() {
		currentValue = 0;
	}
	
	

	public int getCurrentValue() {
		return currentValue;
	}
	
	
	
}
