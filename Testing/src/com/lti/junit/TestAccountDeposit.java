package com.lti.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAccountDeposit {
	private Account acnt;
	
	@Before
	public void init() {
		acnt = new Account(1000);
	}
	
	@After
	public void clean() {
		acnt = null;
	}

	@Test
	public void testNegativeDeposit() {
		assertEquals(0.0, acnt.deposit(-1000),0);
	}
	
	@Test
	public void testActualDeposit() {
		assertEquals(2000, acnt.deposit(1000),0);
	}
	
	@Test
	public void testNegativeWithdraw() {
		assertEquals(0.0, acnt.withdraw(1000),0);
	}
}


