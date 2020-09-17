package com.demo.inheritance.demo2;

public class TraineeEmployee extends Employee{
	private double performanceIndex;

	public TraineeEmployee(int id, String name, double salary,double performanceIndex) {
		super(id, name,salary);
		this.performanceIndex = performanceIndex;
	}

	@Override
	public String getDetails() {
		return super.getDetails() + " Performance Index: " +this.performanceIndex;
	}
	
}
