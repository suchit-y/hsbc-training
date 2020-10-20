package com.demo.spring.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;
import com.demo.spring.exception.CustomerAlreadyExistsException;
import com.demo.spring.exception.CustomerNotFoundException;
import com.demo.spring.exception.DbEmptyException;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private CustomerDb custDb;

	@Override
	public boolean register(int id, Customer cust) {
		try {
			if (custDb.getDb().containsKey(id))
				throw new CustomerAlreadyExistsException();
			else {
				this.custDb.getDb().put(id, cust);
				return true;
			}
		} catch (CustomerAlreadyExistsException e) {
			throw e;
		}
	}

	@Override
	public List<Customer> showCustomers() {
		try {
			if (custDb.getDb().isEmpty())
				throw new DbEmptyException();
			else
				return (List<Customer>) custDb.getDb().values();
		} catch (DbEmptyException e) {
			throw e;
		}
	}

	@Override
	public Customer findCustomerById(int id) {
		try {
			if (custDb.getDb().containsKey(id))
				return custDb.getDb().get(id);
			else
				throw new CustomerNotFoundException();
		} catch (CustomerNotFoundException e) {
			throw e;
		}
	}

}
