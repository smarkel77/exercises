package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.techelevator.CigarParty;

public class CigarPartyTest {
	CigarParty test = null;
	
	@Before
	public void setup() {
		System.out.println("setup");
		test = new CigarParty();
		
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
	}
	
	@Test
	public void does_hasMinimumCigars_work() {
		Assert.assertEquals(false, test.haveParty(30, false));
		Assert.assertEquals(true, test.haveParty(40, false));
		Assert.assertEquals(false, test.haveParty(61, false));
		Assert.assertEquals(false, test.haveParty(30, true));
		Assert.assertEquals(true, test.haveParty(40, true));
		Assert.assertEquals(true, test.haveParty(61, true));
	}

}
