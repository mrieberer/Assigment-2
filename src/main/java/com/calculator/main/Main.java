package com.calculator.main;

import com.calculator.classes.BasicCalculator;
import com.calculator.classes.AdvancedCalculator;

public class Main {
	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		AdvancedCalculator ac = new AdvancedCalculator();
		System.out.println(bc.addition(524,312));
		System.out.println(bc.subtraction(524,312));
		System.out.println(bc.multiplication(524,312));
		System.out.println(bc.division(524,312));
		System.out.println(ac.addition(524,312));
		System.out.println(ac.subtraction(524,312));
		System.out.println(ac.multiplication(524,312));
		System.out.println(ac.division(524,312));
		System.out.println(ac.squareRoot(121));
		System.out.println(ac.square(12));
		System.out.println(ac.toThePowerOf(4,4));
		System.out.println(ac.cubeRoot(125));
		System.out.println(ac.remainder(5,3));
	}
}
