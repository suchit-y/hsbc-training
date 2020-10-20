package com.demo.spring.dao;

import java.util.HashMap;
import java.util.List;

import com.demo.spring.entity.Customer;

public interface CustomerDao {
	public boolean register(int id, Customer cust);

	public List<Customer> showCustomers();

	public Customer findCustomerById(int id);
}
