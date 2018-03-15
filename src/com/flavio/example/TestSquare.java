package com.flavio.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSquare {
	
	@Test
	public void testSquare() {
		Square test=new Square();
		int actual = test.square(5);
		int expected=25;
		assertEquals("5x5=25", expected, actual);
	} 

}
