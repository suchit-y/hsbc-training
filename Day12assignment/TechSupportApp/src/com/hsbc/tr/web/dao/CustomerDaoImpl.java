package com.hsbc.tr.web.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.hsbc.tr.web.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {

	Customer cust;

	private static List<Customer> custList = new ArrayList<Customer>();

	@Override
	public boolean register(Customer c) {
		if (isRegistered(c.getEmail()) == false) {
			c.setRegistered(true);
			custList.add(c);
		}
		return true;
	}

	@Override
	public List<Customer> getCustList() {
		return custList;
	}

	@Override
	public Customer find(String email) {
//		for (int i = 0; i < custList.size(); i++) {
//			custList.get(i).getEmail().equals(email);
//			return i;
//		}
		for (Customer customer : custList) {
			if (customer.getEmail().equals(email)) {
				return customer;
			}
		}
		return null;
	}

	@Override
	public boolean isRegistered(String email) {
		if (find(email) != null)
			return true;
		else
			return false;
	}
}
