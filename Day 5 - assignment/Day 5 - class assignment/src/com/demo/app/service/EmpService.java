package com.demo.app.service;

import com.demo.app.dao.EmpDao;
import com.demo.entity.Emp;
import com.demo.exception.EmployeeExistsException;

public class EmpService {
	EmpDao dao;

	public EmpService(EmpDao dao) {
		this.dao = dao;
	}

	public String register(int id, String name, String city, double salary) {
		String response = "";
		try {
			response = dao.save(new Emp(id, name, city, salary));
		} catch (EmployeeExistsException e) {
			return e.toString();
		}
		return response;
	}
}
