package com.demo.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.CustomerDao;
import com.demo.spring.entity.Customer;

@Service
public class CustomerService {
	@Autowired
	@Qualifier("customerDaoJdbcImpl")
	CustomerDao dao;

	public boolean registerCustomer(int id, Customer cust) {
		try {
			return dao.register(id, cust);
		} catch (Exception e) {
			throw e;
		}
	}

	public List<Customer> showCustomers() {
		try {
			return dao.showCustomers();
		} catch (Exception e) {
			throw e;
		}
	}

	public Customer findCustomerById(int id) {
		try {
			return dao.findCustomerById(id);
		} catch (Exception e) {
			throw e;
		}
	}
}
