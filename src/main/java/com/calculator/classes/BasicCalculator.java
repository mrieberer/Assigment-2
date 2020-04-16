package com.calculator.classes;

import com.calculator.interfaces.BasicOperations;

public class BasicCalculator implements BasicOperations {
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	public double division(double firstNumber, double secondNumber) {
		return firstNumber / secondNumber;
	}
}
