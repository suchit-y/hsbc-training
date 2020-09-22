package com.demo.exception;

public class EmployeeExistsException extends RuntimeException {
	@Override
	public String toString() {
		return "**Employee already exists**";
	}
}
