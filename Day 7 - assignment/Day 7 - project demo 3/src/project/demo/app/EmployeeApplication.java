package project.demo.app;

import project.demo.dao.EmployeeDao;
import project.demo.entity.Employee;
import project.demo.impl.EmployeeDaoImpl;
import project.demo.service.EmployeeService;

public class EmployeeApplication {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		EmployeeService es = new EmployeeService(dao);

		es.registerEmployee(100, new Employee(100, "Suchit", "Pune", 25000));
		es.registerEmployee(101, new Employee(101, "Sagar", "Hyderabad", 25000));
		es.registerEmployee(101, new Employee(101, "Sanjay", "Pune", 25000));
		es.registerEmployee(102, new Employee(102, "Shantanu", "Hyderabad", 25000));
		es.registerEmployee(103, new Employee(103, "Srikar", "Pune", 25000));
		es.registerEmployee(104, new Employee(104, "Shravan", "Pune", 25000));

		es.displayEmployeeList();

		Employee emp = es.findById(100);
		System.out.println(emp.toString());

		es.updateEmployee(104, new Employee(104, "Sruthi", "Hyderabad", 26000));
		es.updateEmployeeAttr(100, "name", "Aakash");
		es.updateEmployeeAttr(101, "city", "Pune");
		es.updateEmployeeAttr(102, "salary", 26000);

		es.displayEmployeeList();
	}

}
