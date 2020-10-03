package com.hsbc.tr.web.dao;

import java.util.List;

import com.hsbc.tr.web.entity.Customer;

public interface CustomerDao {
	public boolean isRegistered(String email);

	public Customer find(String email);

	public boolean register(Customer c);

	public List<Customer> getCustList();
}
