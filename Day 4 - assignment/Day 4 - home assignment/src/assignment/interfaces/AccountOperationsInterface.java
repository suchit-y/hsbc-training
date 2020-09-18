package assignment.interfaces;

import assignment.exception.AccountBlockedException;
import assignment.exception.InsufficientBalanceException;

public interface AccountOperationsInterface {
	public double deposit(double amt) throws AccountBlockedException;

	public double withdraw(double amt) throws AccountBlockedException, InsufficientBalanceException;

	public double getBalance() throws AccountBlockedException;

	public void blockAccount();
}