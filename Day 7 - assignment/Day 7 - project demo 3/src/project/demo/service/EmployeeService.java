package project.demo.service;

import project.demo.dao.EmployeeDao;
import project.demo.dao.EmployeeNotFoundException;
import project.demo.entity.Employee;

public class EmployeeService {
	EmployeeDao dao;

	public EmployeeService(EmployeeDao dao) {
		this.dao = dao;
	}

	public void registerEmployee(int id, Employee emp) {
		try {
			dao.register(id, emp);
			System.out.println("Employee " + id + " registered...");
		} catch (Exception e) {
			System.out.println("Empsloyee " + id + " already exists");
		}
	}

	public void removeEmployee(int id) {
		try {
			dao.remove(id);
			System.out.println("Employee " + id + " removed...");
		} catch (Exception e) {
			System.out.println("Employee " + id + " doesn't exist");
		}
	}

	public void updateEmployee(int id, Employee emp) {
		try {
			dao.update(id, emp);
			System.out.println("Employee " + id + " updated...");
		} catch (Exception e) {
			System.out.println("Employee " + id + " doesn't exist");
		}
	}

	public void updateEmployeeAttr(int id, String attr, Object val) {
		try {
			if (attr == "name") {
				String newValue = (String) val;
				dao.updateName(id, newValue);
				System.out.println("Employee " + id + " updated...");
			} else if (attr == "city") {
				String newValue = (String) val;
				dao.updateCity(id, newValue);
				System.out.println("Employee " + id + " updated...");
			} else if (attr == "salary") {
				Double newValue = Double.parseDouble(val.toString());
				dao.updateSalary(id, newValue);
				System.out.println("Employee " + id + " updated...");
			} else
				throw new EmployeeNotFoundException();
		} catch (Exception e) {
			System.out.println("Employee " + id + " doesn't exist");
		}
	}

	public Employee findById(int id) {
		try {
			Employee emp = dao.find(id);
			System.out.println("Employee " + id + " found...");
			return emp;
		} catch (Exception e) {
			System.out.println("Employee " + id + " doesn't exist");
		}
		return null;
	}

	public void displayEmployeeList() {
		dao.display();
	}
}
