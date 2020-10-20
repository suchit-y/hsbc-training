package com.demo.spring.entity;

public class Customer {
	private int customerId;
	private String customerName;
	private long mobile;

	public Customer() {

	}

	public Customer(int customerId, String customerName, long mobile) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobile = mobile;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

}
