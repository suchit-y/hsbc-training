package assignment;

import assignment.exception.AccountBlockedException;
import assignment.interfaces.AccountOperationsInterface;
import assignment.exception.InsufficientBalanceException;

public class Account implements AccountOperationsInterface {
	int accountNumber;
	String accountholderName;
	int balance;
	boolean accountBlocked;

	public Account(int accountNumber, String accountholderName, int balance) {
		this.accountNumber = accountNumber;
		this.accountholderName = accountholderName;
		this.balance = balance;
		this.accountBlocked = false;
	}

	@Override
	public double deposit(double amt) throws AccountBlockedException {
		if (this.accountBlocked)
			throw new AccountBlockedException();
		else
			this.balance += amt;
		return this.balance;
	}

	@Override
	public double withdraw(double amt) throws AccountBlockedException, InsufficientBalanceException {
		if (this.accountBlocked)
			throw new AccountBlockedException();
		else if (amt > this.balance)
			throw new InsufficientBalanceException();
		else
			this.balance -= amt;
		return this.balance;
	}

	@Override
	public double getBalance() throws AccountBlockedException {
		if (this.accountBlocked)
			throw new AccountBlockedException();
		else
			return this.balance;
	}

	@Override
	public void blockAccount() {
		this.accountBlocked = true;
	}

}
