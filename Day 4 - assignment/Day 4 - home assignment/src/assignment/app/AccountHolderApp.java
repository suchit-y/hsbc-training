package assignment.app;

import assignment.Account;

public class AccountHolderApp {

	public static void main(String[] args) {
		Account a = new Account(80, "Suchit", 1000);
		try {
			System.out.println(a.deposit(1000));
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(a.withdraw(900));
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println(a.withdraw(1500));
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			a.blockAccount();
			System.out.println(a.deposit(1000));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
