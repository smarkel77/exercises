package com.techelevator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.SameFirstLast;


public class SameFirstLastTest {
	SameFirstLast test = null;
	
	@Before
	public void setup() {
		test = new SameFirstLast();
	}
	
	@After
	public void terminte() {
		
	}
	
	@Test
	public void array_over_1_and_equal() {
		int[] nums = {2, 3, 4, 2};
		Assert.assertTrue(test.isItTheSame(nums));
	}
	
	@Test
	public void array_over_1_and_not_equal() {
		int[] nums = {2, 3, 4, 3};
		Assert.assertFalse(test.isItTheSame(nums));
	}
	
	@Test
	public void array_not_over_1() {
		int[] nums = {2};
		Assert.assertTrue(test.isItTheSame(nums));
	}
	
	@Test
	public void array_empty() {
		int[] nums = {};
		Assert.assertFalse(test.isItTheSame(nums));
	}

}
