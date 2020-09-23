package project.demo.dao;

import project.demo.entity.Employee;

public interface EmployeeDao {
	public void register(int id, Employee e);

	public void remove(int id);

	public void display();

	public void update(int id, Employee emp);

	public void updateName(int id, String name);

	public void updateCity(int id, String city);

	public void updateSalary(int id, double salary);

	public Employee find(int id);
}
