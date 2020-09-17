package com.demo.inheritance.demo3;

public class Rectangle extends Figure {
	public Rectangle(double length, double breadth) {
		super(length, breadth);
	}

	@Override
	public double area() {
		return dim1 * dim2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
