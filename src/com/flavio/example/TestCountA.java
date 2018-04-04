package com.flavio.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCountA {

	@Test
	public void testCountA() {
		CountA test = new CountA();
		int actual = test.countA("alphabeta");
		int expected = 2;
		assertEquals("alphabet has 2 a", expected, actual);
	}


}
