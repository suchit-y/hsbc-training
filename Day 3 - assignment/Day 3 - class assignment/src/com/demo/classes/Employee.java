package com.demo.classes;

public class Employee {
	private int empId;
	private String empName;

	public Employee() {
		this.empId = 0;
		this.empName = "null";
	}

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return this.empId;
	}

	public String getEmpName() {
		return this.empName;
	}
}
