package project.demo.dao;

public class EmployeeNotFoundException extends RuntimeException {
	@Override
	public String toString() {
		return "EmployeeNotFoundException";
	}
}
