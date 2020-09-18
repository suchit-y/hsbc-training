package com.demo.app.service;

import com.demo.app.dao.EmpDao;
import com.demo.app.entity.Emp;

public class EmpService {
	EmpDao dao;

	public EmpService(EmpDao dao) {
		this.dao = dao;
	}

	public String register(int id, String name) {
		String response = dao.save(new Emp(id, name));
		return response;
	}
}
