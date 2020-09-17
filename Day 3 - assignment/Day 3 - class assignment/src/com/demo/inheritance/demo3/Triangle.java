package com.demo.inheritance.demo3;

public class Triangle extends Figure {
	public Triangle(double base, double height) {
		super(base, height);
	}

	@Override
	public double area() {
		return 0.5 * dim1 * dim2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
