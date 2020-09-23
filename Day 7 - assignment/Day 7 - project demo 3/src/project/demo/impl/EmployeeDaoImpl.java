package project.demo.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import project.demo.dao.EmployeeDao;
import project.demo.dao.EmployeeExistsException;
import project.demo.dao.EmployeeNotFoundException;
import project.demo.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	HashMap<Integer, Employee> empMap = new HashMap<>();

	@Override
	public void register(int id, Employee emp) {
		try {
			if (empMap.containsKey(id) == false)
				empMap.put(id, emp);
			else
				throw new EmployeeExistsException();
		} catch (EmployeeExistsException e) {
			throw e;
		}
	}

	@Override
	public void remove(int id) {
		try {
			if (empMap.containsKey(id))
				empMap.remove(id);
			else
				throw new EmployeeNotFoundException();
		} catch (EmployeeNotFoundException e) {
			throw e;
		}
	}

	@Override
	public void update(int id, Employee emp) {
		try {
			if (empMap.containsKey(id)) {
				empMap.put(id, emp);
			} else
				throw new EmployeeNotFoundException();
		} catch (EmployeeNotFoundException e) {
			throw e;
		}
	}

	@Override
	public void updateName(int id, String name) {
		try {
			if (empMap.containsKey(id)) {
				Employee emp = empMap.get(id);
				emp.setEmpName(name);
				empMap.put(id, emp);
			} else
				throw new EmployeeNotFoundException();
		} catch (EmployeeNotFoundException e) {
			throw e;
		}
	}

	@Override
	public void updateCity(int id, String city) {
		try {
			if (empMap.containsKey(id)) {
				Employee emp = empMap.get(id);
				emp.setCity(city);
				empMap.put(id, emp);
			} else
				throw new EmployeeNotFoundException();
		} catch (EmployeeNotFoundException e) {
			throw e;
		}
	}

	@Override
	public void updateSalary(int id, double salary) {
		try {
			if (empMap.containsKey(id)) {
				Employee emp = empMap.get(id);
				emp.setSalary(salary);
				empMap.put(id, emp);
			} else
				throw new EmployeeNotFoundException();
		} catch (EmployeeNotFoundException e) {
			throw e;
		}
	}

	@Override
	public Employee find(int id) {
		try {
			if (empMap.containsKey(id)) {
				Employee emp = empMap.get(id);
				return emp;
			} else
				throw new EmployeeNotFoundException();
		} catch (EmployeeNotFoundException e) {
			throw e;
		}
	}

	@Override
	public void display() {
		Set<Integer> keySet = empMap.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while (itr.hasNext()) {
			int id = itr.next();
			System.out.println(id + " " + empMap.get(id));
		}
	}
}
