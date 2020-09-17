package assignment;

public class HomeLoan {
	private double loanAmount, loanPercentage;
	private int numberOfMonths;
	private BankAccountHolder person;
	double simpleInterest;

	public double getLoanAmount() {
		return loanAmount;
	}

	public double getLoanPercentage() {
		return loanPercentage;
	}

	public int getNumberOfMonths() {
		return numberOfMonths;
	}

	public BankAccountHolder getPerson() {
		return person;
	}

	public void setPerson(BankAccountHolder person) {
		this.person = person;
	}

	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public void setLoanPercentage(double loanPercentage) {
		this.loanPercentage = loanPercentage;
	}

	public double getSimpleInterest() {
		this.simpleInterest = loanAmount * loanPercentage * (numberOfMonths / 12) / 100;
		return simpleInterest;
	}

	public double getAmountPayable() {
		return loanAmount + simpleInterest;
	}

}
