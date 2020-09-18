package com.demo.bank.exception;

public class LowBalanceException extends Exception {
	@Override
	public String toString() {
		return "LowBalanceException";
	}
}
