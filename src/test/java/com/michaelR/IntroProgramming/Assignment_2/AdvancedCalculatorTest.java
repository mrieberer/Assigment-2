package com.michaelR.IntroProgramming.Assignment_2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.classes.AdvancedCalculator;

public class AdvancedCalculatorTest {
	
	AdvancedCalculator ac = new AdvancedCalculator();

	@Test
	public void testCubeRoot() {
		assertEquals(ac.cubeRoot(27), 3, 0.001);
	}
	
	@Test
	public void testRemainder() {
		assertEquals(ac.remainder(5, 6), 5, 0.001);
	}
	
	@Test
	public void testSquare() {
		assertEquals(ac.square(11), 121, 0.001);
	}
	
	@Test
	public void testSquareRoot() {
		assertEquals(ac.squareRoot(121), 11, 0.001);
	}
	
	@Test
	public void testToThePowerOf() {
		assertEquals(ac.toThePowerOf(2, 5), 32, 0.001);
	}
	
}
