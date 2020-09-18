package com.demo.bank.app;

import com.demo.bank.BankAccount;
import com.demo.bank.exception.LowBalanceException;

public class BankApp {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(80, "Suchit", 1200);
		BankAccount ba2 = new BankAccount(81, "Shantanu", 2000);

		try {
			ba1.withdraw(200);
			System.out.println("Done succesfully...");
		} catch (LowBalanceException e) {
			System.out.println(e);
			System.out.println("Process incomplete...");
		}
		
		try {
			ba2.withdraw(1500);
			System.out.println("Done succesfully...");
		} catch (LowBalanceException e) {
			System.out.println(e);
			System.out.println("Process incomplete...");
		}
	}

}
