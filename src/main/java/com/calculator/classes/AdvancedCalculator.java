package com.calculator.classes;

import com.calculator.interfaces.AdvancedOperations;
import static java.lang.Math.*;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations{

	public double squareRoot(double number) {
		return sqrt(number);
	}
	public double square(double number) {
		return pow(number,2);
	}
	public double toThePowerOf(double base, double exponent) {
		return pow(base,exponent);
	}
	public double cubeRoot(double number) {
		return pow(number,.333333);
	}
	public double remainder(double dividend, double divisor) {
		return dividend % divisor;
	}
}
