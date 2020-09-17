package com.demo.interfaces.emp;

import com.demo.classes.Employee;

public interface EmpDao {
	public Employee findById(int id);

	public String save(Employee e);

	public void listAllEmps();
}
