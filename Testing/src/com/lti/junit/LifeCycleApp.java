package com.lti.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LifeCycleApp {
	
	private List<String> list;
	
	@BeforeClass
	public static void oneTimeSetup() {
		System.out.println("Before class=one time setup");
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		System.out.println("After class- one time tear down");
	}
	
	@Before
	public void setUp() {
		list= new ArrayList<String>();
		//list.add("Apple");
		System.out.println("Before-setup");
		
	}
	
	@After
	public void tearDown() {
		list.clear();
		System.out.println("After teardown");
	}
	
	@Test
	public void testEmptyList() {
		assertTrue(list.isEmpty());
		System.out.println("test-test empty list");
	}
	
	public void testOneItem() {
		list.add("banana");
		assertEquals(1, list.size());
		System.out.println("test-test one item");
	}
}
