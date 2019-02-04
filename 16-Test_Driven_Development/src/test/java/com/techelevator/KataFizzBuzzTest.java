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

}
