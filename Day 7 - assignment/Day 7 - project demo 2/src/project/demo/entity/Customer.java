package project.demo.entity;
/**
 * 
 * @author Y. Suchit
 *
 */
public class Customer {
	private int custId;
	private String custName;
	private String custMobile;
	private String custAddress;

	Customer() {
		/*
		 * default constructor
		 */

	}

	public Customer(int custId, String custName, String custMobile, String custAddress) {
		/*
		 * constructor initialization
		 */
		this.custId = custId;
		this.custName = custName;
		this.custMobile = custMobile;
		this.custAddress = custAddress;
	}

	public int getCustId() {
		/**
		 * get customer ID
		 */
		return custId;
	}

	public void setCustId(int custId) {
		/**
		 * set customer ID
		 */
		this.custId = custId;
	}

	public String getCustName() {
		/**
		 * get customer name
		 */
		return custName;
	}

	public void setCustName(String custName) {
		/**
		 * set customer name
		 */
		this.custName = custName;
	}

	public String getCustMobile() {
		/**
		 * get customer mobile
		 */
		return custMobile;
	}

	public void setCustMobile(String custMobile) {
		/**
		 * set custoemr mobile
		 */
		this.custMobile = custMobile;
	}

	public String getCustAddress() {
		/**
		 * get customer address
		 */
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		/**
		 * set customer address
		 */
		this.custAddress = custAddress;
	}

	@Override
	public String toString() {
		/**
		 * display all details
		 */
		return "Id: " + custId + " Name: " + custName + " Mobile: " + custMobile + ", Address: " + custAddress;
	}

}
