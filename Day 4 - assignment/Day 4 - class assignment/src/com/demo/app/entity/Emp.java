package com.demo.app.entity;

public class Emp {
	private int empId;
	private String empName;

	public Emp(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return empId + " " + empName;
	}
}