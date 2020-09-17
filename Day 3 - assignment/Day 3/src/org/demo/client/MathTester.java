package org.demo.client;

import org.demo.tools.Calculator;

public class MathTester {

	public static void main(String[] args) {
		Calculator cal = new Calculator(10,20);
		System.out.println(cal.add());
		System.out.println(cal.subtract());
		System.out.println(cal.multiply());
		System.out.println(cal.divide());
	}

}
