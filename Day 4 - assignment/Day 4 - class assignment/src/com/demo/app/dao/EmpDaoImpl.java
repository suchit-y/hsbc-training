package com.demo.app.dao;

import com.demo.app.entity.Emp;

public class EmpDaoImpl implements EmpDao {

	@Override
	public String save(Emp e) {
		return "Employee details saved." + " " + e;
	}

}
