package com.michaelR.IntroProgramming.Assignment_2;

import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;
import com.calculator.classes.BasicCalculator;
import java.lang.ArithmeticException;

public class BasicCalculatorTest {

	BasicCalculator bc = new BasicCalculator();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());
	int NumberOfRepetitions = 10;

	@Test
	public void testAddition() {
		double firstTestParameter = 0.0;
		double secondTestParameter = 0.0;
		double expectedResult = 0.0;
		int i = 0;

		do {
			expectedResult = firstTestParameter + secondTestParameter;
			LOG.info("Testing method BasicCalculator.addition with parmaeters: " + firstTestParameter + " and " + secondTestParameter);
			assertEquals(bc.addition(firstTestParameter, secondTestParameter), expectedResult, 0);
			firstTestParameter = (random.nextDouble()-0.5)*20000;
			secondTestParameter = (random.nextDouble()-0.5)*20000;
			i++;
		} while (i < NumberOfRepetitions);
	}

	@Test
	public void testSubtraction() {
		double firstTestParameter = 0.0;
		double secondTestParameter = 0.0;
		double expectedResult = 0.0;
		int i = 0;

		do {
			expectedResult = firstTestParameter - secondTestParameter;
			LOG.info("Testing method BasicCalculator.subtraction with parmaeters: " + firstTestParameter + " and " + secondTestParameter);
			assertEquals(bc.subtraction(firstTestParameter, secondTestParameter), expectedResult, 0);
			firstTestParameter = (random.nextDouble()-0.5)*20000;
			secondTestParameter = (random.nextDouble()-0.5)*20000;
			i++;
		} while (i < NumberOfRepetitions);
	}

	@Test
	public void testMultiplication() {
		double firstTestParameter = 0.0;
		double secondTestParameter = 0.0;
		double expectedResult = 0.0;
		int i = 0;

		do {
			expectedResult = firstTestParameter * secondTestParameter;
			LOG.info("Testing method BasicCalculator.multiplication with parmaeters: " + firstTestParameter + " and " + secondTestParameter);
			assertEquals(bc.multiplication(firstTestParameter, secondTestParameter), expectedResult, 0);
			firstTestParameter = (random.nextDouble()-0.5)*20000;
			secondTestParameter = (random.nextDouble()-0.5)*20000;
			i++;
		} while (i < NumberOfRepetitions);
	}

	@Test
	public void testDivision() {
		double firstTestParameter = 5.0;
		double secondTestParameter = 0;
		double expectedResult = 0.0;
		int i = 0;

		do {
			expectedResult =  firstTestParameter / secondTestParameter;/*
			try{
				expectedResult =  firstTestParameter / secondTestParameter;
				//System.out.println("NO exception!");
			} catch(ArithmeticException e){
				//System.out.println("exception!");
				expectedResult = 0.0;
			}     */
			LOG.info("Testing method BasicCalculator.division with parameters: " + firstTestParameter + " and " + secondTestParameter);
			assertEquals(bc.division(firstTestParameter, secondTestParameter), expectedResult, 0);

			firstTestParameter = (random.nextDouble()-0.5)*20000;
			secondTestParameter = (random.nextDouble()-0.5)*20000;
			i++;
		} while (i < NumberOfRepetitions);
	}
}

