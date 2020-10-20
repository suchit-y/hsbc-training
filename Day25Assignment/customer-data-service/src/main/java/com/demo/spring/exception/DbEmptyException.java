package com.demo.spring.exception;

public class DbEmptyException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "DbEmptyException";
	}
}
