package com.techelevator;

import org.junit.Test;
import org.junit.Assert;

public class KataFizzBuzzTest {
	
	@Test
	public void number_3_returns_fizz() {
		int input = 3;
		String output = KataFizzBuzz.fizzBuzz(input);
		Assert.assertEquals("Fizz", output);
		
	}

}
