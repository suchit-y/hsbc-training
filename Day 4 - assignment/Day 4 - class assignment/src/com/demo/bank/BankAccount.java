package com.demo.bank;

import com.demo.bank.exception.LowBalanceException;

public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance = 1000.0;

	public BankAccount(int accountNumber, String accountHolder, int balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public double withdraw(double amount) throws LowBalanceException {
		double result;
		try {
			result = this.balance - amount;
			if (result < 1000)
				throw new LowBalanceException();
			else {
				this.balance = result;
				System.out.println("balance: " + result);
			}
		} catch (LowBalanceException e) {
			throw e;
		}
		return result;
	}
}
