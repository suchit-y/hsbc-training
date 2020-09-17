package assignment;

public class BankAccountHolder {
	private long accountNumber, accountBalance;
	private String accountHolderName;

	BankAccountHolder(long accountNumber, String accountHolderName, long accountBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.accountHolderName = accountHolderName;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public long getAccountBalance() {
		return accountBalance;
	}
}
