package com.demo.impl.employee;

import com.demo.classes.Employee;
import com.demo.interfaces.emp.EmpDao;

public class EmpDaoMockHibernateImpl implements EmpDao {

	@Override
	public Employee findById(int id) {
		System.out.println("Employee found in Hibernate.");
		return null;
	}

	@Override
	public String save(Employee e) {
		return e.getEmpId() + " " + e.getEmpName() + " exist in Hibernate";
	}

	@Override
	public void listAllEmps() {
		System.out.println("Listing all employees from Hibernate...");
	}

}
