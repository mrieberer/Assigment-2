package com.michaelR.IntroProgramming.Assignment_2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.classes.BasicCalculator;

public class BasicCalculatorTest {
	
	BasicCalculator bc = new BasicCalculator();

	@Test
	public void testAddition() {
		assertEquals(bc.addition(3, 5), 8, 0);
	}
	
	@Test
	public void testSubtraction() {
		assertEquals(bc.subtraction(9, 5), 4, 0);
	}
	
	@Test
	public void testMultiplication() {
		assertEquals(bc.multiplication(3, 5), 15, 0);
	}
	
	@Test
	public void testDivsion() {
		assertEquals(bc.division(30, 5), 6, 0);
	} 

}

