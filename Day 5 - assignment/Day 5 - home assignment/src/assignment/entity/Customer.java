package assignment.entity;

import java.io.Serializable;

public class Customer implements Serializable {
	private int customerId;
	private String customerName;
	private String address;

	public Customer(int customerId, String customerName, String address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "customerId: " + customerId + " customerName: " + customerName + " address: " + address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
