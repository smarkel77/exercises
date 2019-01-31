package com.techelevator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.StringBits;




public class StringBitsTest {
	StringBits test = null;
	
	@Before
	public void setup() {
		test = new StringBits();
	}
	@After
	public void terminate() {
	}
	
	@Test
	public void returns_every_other_string_longer_than_3() {
		String str = "HappyBirthday";
		Assert.assertEquals("Hpyitdy", test.getBits(str));
	}
	
	@Test
	public void returns_every_other_string_less_than_3() {
		String str = "Ha";
		Assert.assertEquals("H", test.getBits(str));
	}
	
	@Test
	public void tests_empty_string() {
		String str = "";
		Assert.assertEquals("", test.getBits(str));
	}

}
