package com.michaelR.IntroProgramming.Assignment_2;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;
import com.calculator.classes.AdvancedCalculator;
import com.calculator.classes.BasicCalculator;

public class AdvancedCalculatorTest {
	
	AdvancedCalculator ac = new AdvancedCalculator();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());
	int NumberOfRepetitions = 1;

	@Test
	public void testCubeRoot() {
		double firstTestParameter = 0.0;
		double expectedResult = 0.0;
		
		for (int i = 0; i < NumberOfRepetitions; i++) {
			firstTestParameter = random.nextDouble();
			expectedResult = pow(firstTestParameter, 0.333333);
			LOG.info("Testing method AdvancedCalculator.cubeRoot with parameter: " + firstTestParameter);
			assertEquals(ac.cubeRoot(firstTestParameter), expectedResult, 0.001);
		}
	}
	
	@Test
	public void testRemainder() {
		double firstTestParameter = 0.0;
		double secondTestParameter = 0.0;
		double expectedResult = 0.0;
		
		for (int i = 0; i < NumberOfRepetitions; i++) {
			firstTestParameter = random.nextDouble();
			secondTestParameter = random.nextDouble();
			expectedResult = firstTestParameter % secondTestParameter;
			LOG.info("Testing method AdvancedCalculator.remainder with parameters: " + firstTestParameter + " and " + secondTestParameter);
			assertEquals(ac.remainder(firstTestParameter, secondTestParameter), expectedResult, 0.001);
		}
	}
	
	@Test
	public void testSquare() {
		double firstTestParameter = 0.0;
		double expectedResult = 0.0;
		
		for (int i = 0; i < NumberOfRepetitions; i++) {
			firstTestParameter = random.nextDouble();
			expectedResult = firstTestParameter * firstTestParameter;
			LOG.info("Testing method AdvancedCalculator.square with parameter: " + firstTestParameter);
			assertEquals(ac.square(firstTestParameter), expectedResult, 0.001);
		}
	}
	
	@Test
	public void testSquareRoot() {
		double firstTestParameter = 0.0;
		double expectedResult = 0.0;
		
		for (int i = 0; i < NumberOfRepetitions; i++) {
			firstTestParameter = random.nextDouble();
			expectedResult = sqrt(firstTestParameter);
			LOG.info("Testing method AdvancedCalculator.squareRoot with parameter: " + firstTestParameter);
			assertEquals(ac.squareRoot(firstTestParameter), expectedResult, 0.001);
		}
	}
	
	@Test
	public void testToThePowerOf() {
		double firstTestParameter = 0.0;
		double secondTestParameter = 0.0;
		double expectedResult = 0.0;
		
		for (int i = 0; i < NumberOfRepetitions; i++) {
			firstTestParameter = random.nextDouble();
			secondTestParameter = random.nextDouble();
			expectedResult = pow(firstTestParameter, secondTestParameter);
			LOG.info("Testing method AdvancedCalculator.toThePowerOf with parameters: " + firstTestParameter + " and " + secondTestParameter);
			assertEquals(ac.toThePowerOf(firstTestParameter, secondTestParameter), expectedResult, 0.001);
		}
	}
	
}
