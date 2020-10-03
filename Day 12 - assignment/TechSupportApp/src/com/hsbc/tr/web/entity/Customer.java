package com.hsbc.tr.web.entity;

public class Customer {
	private String fname;
	private String lname;
	private String phone;
	private String email;
	private boolean registered;

	public Customer() {
	}

	public Customer(String fname, String lname, String phone, String email) {
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "fname: " + fname + " lname: " + lname + " phone: " + phone + " email: " + email + " registered: "
				+ registered;
	}

}
