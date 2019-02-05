package com.techelevator;

import org.junit.Test;
import org.junit.Assert;

public class KataFizzBuzzTest {
	
	@Test
	public void number_22_returns_empty() {
		int input = 22;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("22", output);
	}
	
	@Test
	public void number_neg10_returns_empty() {
		int input = -10;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("", output);
	}
		
	
	@Test
	public void number_101_returns_empty() {
		int input = 101;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("", output);
	}
	
	
	@Test
	public void number_0_returns_empty() {
		int input = 0;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("", output);
	}
	
	
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
	public void number_52_returns_buzz() {
		int input = 52;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("Buzz", output);
		
	}
	
	@Test
	public void number_53_returns_fizzbuzz() {
		int input = 53;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("FizzBuzz", output);
		
	}

}
