package com.michaelR.IntroProgramming.Assignment_2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.classes.BasicCalculator;

public class BasicCalculatorTest {
	
	BasicCalculator bc = new BasicCalculator();

	@Test
	public void testAddition() {
		assertEquals(bc.addition(3, 5), 8, 0);
		assertEquals(bc.addition(13, 52), 65, 0);
		assertEquals(bc.addition(3, 5), 8, 0);
		assertEquals(bc.addition(13, 52), 65, 0);
	}

}

