package com.michaelR.IntroProgramming.Assignment_2;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.cbrt;
import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;
import com.calculator.classes.AdvancedCalculator;
import com.calculator.classes.BasicCalculator;

public class AdvancedCalculatorTest {

	AdvancedCalculator ac = new AdvancedCalculator();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());
	int NumberOfRepetitions = 10;

	@Test
	public void testCubeRoot() {
		double firstTestParameter = 0.0;
		double expectedResult = 0.0;
		int i = 0;

		do {
			expectedResult = cbrt(firstTestParameter);
			LOG.info("Testing method AdvancedCalculator.cubeRoot with parameter: " + firstTestParameter);
			assertEquals(ac.cubeRoot(firstTestParameter), expectedResult, 0);
			firstTestParameter = (random.nextDouble()-0.5)*20000;
			i++;
		} while (i < NumberOfRepetitions);
	}

	@Test
	public void testRemainder() {
		double firstTestParameter = 5.0;
		double secondTestParameter = 0;
		double expectedResult = 0.0;
		int i = 0;

		do {
			expectedResult =  firstTestParameter % secondTestParameter;/*
			try{
				expectedResult =  firstTestParameter / secondTestParameter;
				//System.out.println("NO exception!");
			} catch(ArithmeticException e){
				//System.out.println("exception!");
				expectedResult = 0.0;
			}     */
			LOG.info("Testing method AdvancedCalculator.remainder with parameters: " + firstTestParameter + " and " + secondTestParameter);
			assertEquals(ac.remainder(firstTestParameter, secondTestParameter), expectedResult, 0);

			firstTestParameter = (random.nextDouble()-0.5)*20000;
			secondTestParameter = (random.nextDouble()-0.5)*20000;
			i++;
		} while (i < NumberOfRepetitions);
	}

	@Test
	public void testSquare() {
		double firstTestParameter = 0.0;
		double expectedResult = 0.0;
		int i = 0;

		do {
			expectedResult = firstTestParameter * firstTestParameter;
			LOG.info("Testing method AdvancedCalculator.square with parameter: " + firstTestParameter);
			assertEquals(ac.square(firstTestParameter), expectedResult, 0);
			firstTestParameter = (random.nextDouble()-0.5)*20000;
			i++;
		} while (i < NumberOfRepetitions);
	}

	@Test
	public void testSquareRoot() {
		double firstTestParameter = 0.0;
		double expectedResult = 0.0;
		int i = 0;

		do {
			expectedResult = sqrt(firstTestParameter);
			LOG.info("Testing method AdvancedCalculator.squareRoot with parameter: " + firstTestParameter);
			assertEquals(ac.squareRoot(firstTestParameter), expectedResult, 0);
			firstTestParameter = (random.nextDouble()-0.5)*20000;
			i++;
		} while (i < NumberOfRepetitions);
	}

	@Test
	public void testToThePowerOf() {
		double firstTestParameter = 0.0;
		double secondTestParameter = 0.0;
		double expectedResult = 0.0;
		int i = 0;

		do {
			expectedResult = pow(firstTestParameter, secondTestParameter);
			LOG.info("Testing method AdvancedCalculator.toThePowerOf with parameters: " + firstTestParameter + " and " + secondTestParameter);
			assertEquals(ac.toThePowerOf(firstTestParameter, secondTestParameter), expectedResult, 0);
			firstTestParameter = random.nextDouble();
			secondTestParameter = random.nextDouble();
			i++;
		} while (i < NumberOfRepetitions);
	}	
}
