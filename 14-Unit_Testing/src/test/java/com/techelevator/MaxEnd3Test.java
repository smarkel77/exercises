package com.techelevator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.techelevator.MaxEnd3;

public class MaxEnd3Test {
	 MaxEnd3 test = null;
	
	@Before
	public void setup() {
		test = new MaxEnd3();
	}
	@After
	public void terminate() {
		
	}
	
	@Test
	public void first_is_larger() {
		int[] nums = {5, 3, 1};
		int[] answer = {5, 5, 5};
		Assert.assertArrayEquals(answer, test.makeArray(nums));
	}
	
	@Test
	public void third_is_larger() {
		int[] nums = {1, 3, 5};
		int[] answer = {5, 5, 5};
		Assert.assertArrayEquals(answer, test.makeArray(nums));
	}
	
	
	@Test
	public void first_and_third_is_equal() {
		int[] nums = {5, 3, 5};
		int[] answer = {5, 5, 5};
		Assert.assertArrayEquals(answer, test.makeArray(nums));
	}
	
	
	
	

}
