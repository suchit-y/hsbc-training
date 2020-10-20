package com.demo.spring.exception;

public class CustomerAlreadyExistsException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "CustomerAlreadyExistsException";
	}
}
