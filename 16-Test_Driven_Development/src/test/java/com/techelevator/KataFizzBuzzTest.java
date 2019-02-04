package com.techelevator;

import org.junit.Test;
import org.junit.Assert;

public class KataFizzBuzzTest {
	
	
	@Test
	public void number_1_returns_string1() {
		int input = 1;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("1", output);
		
	}
	@Test
	public void number_3_returns_fizz() {
		int input = 3;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("Fizz", output);
		
	}
	
	@Test
	public void number_5_returns_buzz() {
		int input = 5;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("Buzz", output);
		
	}
	
	@Test
	public void number_15_returns_fizzbuzz() {
		int input = 15;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("FizzBuzz", output);
		
	}
	
	@Test
	public void number_13_returns_fizz() {
		int input = 13;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("Fizz", output);
		
	}
	
	@Test
	public void number_52_returns_fizz() {
		int input = 52;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("Buzz", output);
		
	}

}
