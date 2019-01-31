package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.techelevator.DateFashion;

public class DateFashionTest {

	DateFashion test = null;

	@Before
	public void setup() {
		System.out.println("setup");
		test = new DateFashion();

	}

	@After
	public void teardown() {
		System.out.println("teardown");
	}
	
	@Test
	public void you_get_a_table() {
		Assert.assertEquals(2, test.getATable(8, 8));
		Assert.assertEquals(2, test.getATable(8, 5));
		Assert.assertEquals(2, test.getATable(5, 8));
		Assert.assertEquals(0, test.getATable(0, 8));
		Assert.assertEquals(0, test.getATable(8, 0));
		Assert.assertEquals(0, test.getATable(0, 5));
		Assert.assertEquals(0, test.getATable(5, 0));
		Assert.assertEquals(0, test.getATable(0, 0));
		Assert.assertEquals(1, test.getATable(5, 5));
	}
	
	

}
