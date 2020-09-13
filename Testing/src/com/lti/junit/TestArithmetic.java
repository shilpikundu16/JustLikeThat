package com.lti.junit;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.lti.junit.Arithmetic;

@RunWith(Parameterized.class)    //saves from manually setting values
public class TestArithmetic {
	private int expected;
	private int first;
	private int second;

	public TestArithmetic(int expected, int first, int second) {
		this.expected = expected;
		this.first = first;
		this.second = second;
	}

	@Parameters
	public static Collection<Integer[]> addedNumbers() {
		return Arrays.asList(new Integer[][] { { 3, 1, 2 }, { 5, 2, 3 },
				{ 7, 3, 4 }, { 9, 4, 5 }, });
	}

	@Test
	public void sum() {
		Arithmetic add = new Arithmetic();
		System.out.println("Addition of : " + first + " and " + second);
		assertEquals(expected, add.addition(first, second));
	}
}





