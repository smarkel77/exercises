package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.AnimalGroupName;




public class AnimalGroupNameTest {
	AnimalGroupName test = null;
	
	
	
	@Before
	public void setup() {
		System.out.println("setup");
		test = new AnimalGroupName();
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
	}
	
	@Test
	public void checks_to_see_if_map_contains_name() {
		Assert.assertEquals("Crash", test.getHerd("rhino"));
		Assert.assertEquals("Tower", test.getHerd("giraffe"));
		Assert.assertEquals("Herd", test.getHerd("elephant"));
		Assert.assertEquals("Murder", test.getHerd("crow"));
		Assert.assertEquals("Kit", test.getHerd("pigeon"));
		Assert.assertEquals("Pride", test.getHerd("lion"));
		Assert.assertEquals("Pat", test.getHerd("flamingo"));
		Assert.assertEquals("Herd", test.getHerd("deer"));
		Assert.assertEquals("Pack", test.getHerd("dog"));
		Assert.assertEquals("Float", test.getHerd("crocodile"));
		Assert.assertEquals("unknown", test.getHerd("cat"));
		Assert.assertEquals("unknown", test.getHerd(null));
		
	}
	
	

}
