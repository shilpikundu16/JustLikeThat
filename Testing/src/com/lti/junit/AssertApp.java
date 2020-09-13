package com.lti.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertApp {
	@Test
	public void testAssert() {
		String s1="Junit";
		String  s2="Junit";
		String s3="Test";
		String s4=null;
		
		assertEquals(s1, s2);
		assertSame(s1, s2);
		assertNotSame(s1, s3);
		assertNull(s4);
		assertNotNull(s1);
		
		int n1=2;
		int n2=5;
		assertTrue(n1<n2);
		assertFalse(n1==n2);
		
		int[] ar1= {1,2,3};
		int[] ar2= {1,2,3};
		assertArrayEquals(ar1, ar2);
		
	}

}
