package com.techelevator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.techelevator.Less20;

public class Less20Test {
	Less20 test = null;
	
	@Before
	public void setup() {
		test = new Less20();
	}
	@After
	public void terminate() {
		
	}
	
	@Test
	public void one_or_two_less_20 () {
		Assert.assertTrue(test.isLessThanMultipleOf20(18));
		Assert.assertTrue(test.isLessThanMultipleOf20(19));
		Assert.assertTrue(test.isLessThanMultipleOf20(78));
		Assert.assertTrue(test.isLessThanMultipleOf20(79));
		Assert.assertFalse(test.isLessThanMultipleOf20(1));
		Assert.assertFalse(test.isLessThanMultipleOf20(21));
		Assert.assertFalse(test.isLessThanMultipleOf20(80));
	}

}
