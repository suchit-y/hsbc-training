package com.demo.inheritance.demo3;

public abstract class Figure {
	protected double dim1, dim2;

	Figure(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	public abstract double area();
}
