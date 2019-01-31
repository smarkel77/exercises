package com.techelevator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.techelevator.Lucky13;

public class Lucky13Test {
	Lucky13 test = null;
	
	@Before
	public void setup() {
		test = new Lucky13();
	}
	@After
	public void terminate() {
		
	}
	
	@Test
	public void lucky13_contains_no_1_and_3() {
		int[] nums = {2, 14, 20};
		Assert.assertTrue(test.getLucky(nums));
	}
	
	@Test
	public void lucky13_contains_1() {
		int[] nums = {1, 14, 20};
		Assert.assertFalse(test.getLucky(nums));
	}
	
	@Test
	public void lucky13_contains_3() {
		int[] nums = {3, 14, 20};
		Assert.assertFalse(test.getLucky(nums));
	}
	
	@Test
	public void lucky13_contains_1_and_3() {
		int[] nums = {1, 14, 3};
		Assert.assertFalse(test.getLucky(nums));
	}

}
