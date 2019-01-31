package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.techelevator.FrontTimes;

public class FrontTimesTest {
	
	FrontTimes test = null;
	
	@Before
	public void setup() {
		System.out.println("setup");
		test = new FrontTimes();

	}

	@After
	public void teardown() {
		System.out.println("teardown");
	}
	
	@Test
	public void return_front_of_string() {
		Assert.assertEquals("AbcAbcAbc", test.generateString("Abc", 3));
		Assert.assertEquals("ChoChoCho", test.generateString("Chocolate", 3));
		Assert.assertEquals("AsAs", test.generateString("As", 2));
		Assert.assertEquals("", test.generateString("", 3));
		Assert.assertEquals("", test.generateString("Abc", 0));
				
	}

}
