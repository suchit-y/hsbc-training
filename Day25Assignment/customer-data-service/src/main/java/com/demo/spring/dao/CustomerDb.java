package com.demo.spring.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Customer;

@Repository
public class CustomerDb {
	private HashMap<Integer, Customer> custList = new HashMap<>();

	public CustomerDb() {
		custList.put(101, new Customer(101, "Suchit", 7441245855L));
		custList.put(102, new Customer(102, "Sagar", 7425896541L));
		custList.put(103, new Customer(103, "Keerthi", 7452321452L));
		custList.put(104, new Customer(104, "Sailesh", 7536985412L));
		custList.put(105, new Customer(105, "Manju", 7845698575L));
		custList.put(106, new Customer(106, "Girish", 9856215478L));
		custList.put(107, new Customer(107, "Kalyani", 9856879878L));
		custList.put(108, new Customer(108, "Harish", 9632153269L));
		custList.put(109, new Customer(109, "Deepak", 9565632659L));
		custList.put(110, new Customer(110, "Sruthi", 8452651235L));
	}

	public HashMap<Integer, Customer> getDb() {
		return this.custList;
	}
}
