package com.techelevator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.techelevator.NonStart;


public class NonStartTest {
	NonStart test = null;
	
	@Before
	public void setup() {
		test = new NonStart();
	}
	
	@After
	public void terminate() {
		
	}
	
	@Test
	public void both_string_greater_than_1() {
		Assert.assertEquals("ellohere", test.getPartialString("Hello", "There"));
	}
	
	@Test
	public void first_string_only_1() {
		Assert.assertEquals("ode", test.getPartialString("j", "code"));
	}
	
	@Test
	public void second_string_only_1() {
		Assert.assertEquals("ava", test.getPartialString("java", "c"));
	}
	
	@Test
	public void both_strings_only_1() {
		Assert.assertEquals("", test.getPartialString("j", "b"));
	}

}
