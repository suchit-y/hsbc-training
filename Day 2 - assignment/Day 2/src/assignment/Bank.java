package assignment;

public class Bank {

	public static void main(String[] args) {
		BankAccountHolder p1 = new BankAccountHolder(800001, "Suchit", 100000);
		BankAccountHolder p2 = new BankAccountHolder(800002, "Shantanu", 200000);
		
		HomeLoan hl = new HomeLoan();
		hl.setPerson(p1);
		hl.setLoanAmount(50000);
		hl.setLoanPercentage(2);
		hl.setNumberOfMonths(12);
		System.out.println(hl.getSimpleInterest());
		System.out.println(hl.getAmountPayable());
		
		PersonalLoan pl = new PersonalLoan();
		pl.setPerson(p1);
		pl.setLoanAmount(50000);
		pl.setLoanPercentage(2);
		pl.setNumberOfMonths(12);
		System.out.println(pl.getSimpleInterest());
		System.out.println(pl.getAmountPayable());
	}

}
