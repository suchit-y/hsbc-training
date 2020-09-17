package com.demo.classes.empApp;

import com.demo.classes.Employee;
import com.demo.interfaces.emp.EmpDao;

public class MyEmpApp {

	public static void main(String[] args) {
		EmpDao ed = MyEmpFactory.getConnection("hibernate");
		
		Employee e = new Employee(80,"Suchit");
		
		ed.findById(80);
		ed.save(e);
		ed.listAllEmps();
	}

}
