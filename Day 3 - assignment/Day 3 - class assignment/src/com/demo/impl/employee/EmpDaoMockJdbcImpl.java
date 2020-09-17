package com.demo.impl.employee;

import com.demo.classes.Employee;
import com.demo.interfaces.emp.EmpDao;

public class EmpDaoMockJdbcImpl implements EmpDao {

	@Override
	public Employee findById(int id) {
		System.out.println("EmployeeId " + id + " found in JDBC.");
		return null;
	}

	@Override
	public String save(Employee e) {
		// return "Employee saved in JDBC.";
		return e.getEmpId() + " " + e.getEmpName() + " exist in JDBC";
	}

	@Override
	public void listAllEmps() {
		System.out.println("Listing all employees from JDBC...");
	}

}
