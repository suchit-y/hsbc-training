package com.hsbc.tr.web.service;

import java.util.List;

import com.hsbc.tr.web.dao.CustomerDao;
import com.hsbc.tr.web.dao.ServiceRequestDao;
import com.hsbc.tr.web.entity.Customer;
import com.hsbc.tr.web.entity.ServiceRequest;

public class TechSupportService {
	CustomerDao dao = null;
	ServiceRequestDao srdao = null;

	TechSupportService(CustomerDao dao) {
		this.dao = dao;
	}

	TechSupportService(ServiceRequestDao srdao) {
		this.srdao = srdao;
	}

	public boolean isRegistered(String email) {
		try {
			return dao.isRegistered(email);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean saveCustomer(String fname, String lname, String phone, String email) {
		try {
			Customer c = new Customer(fname, lname, phone, email);
			return dao.register(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Customer> displayCutomers() {
		try {
			return dao.getCustList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Customer findByFname(String email) {
		try {
			return dao.find(email);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public int saveRequest(String email, String os, String software, String problem) {
		try {
			ServiceRequest sr = new ServiceRequest(email, os, software, problem);
			return srdao.register(sr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public List<ServiceRequest> displayRequest() {
		try {
			return srdao.getReqList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
