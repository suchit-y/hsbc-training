package project.demo.dao;

public class EmployeeExistsException extends RuntimeException {
	@Override
	public String toString() {
		return "EmployeeExistsException";
	}
}
