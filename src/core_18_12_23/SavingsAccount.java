package core_18_12_23;

public class SavingsAccount extends Account {
	public double interestRate = 6.15;

	public void calculateInterest() {
		SavingsAccount s = new SavingsAccount();
		s.Balance = s.Balance+(s.Balance * 1 * interestRate) / 100;
		System.out.println("Account Balance : "+s.Balance);
	}

	public static void main(String[] args) {
		SavingsAccount sb = new SavingsAccount();
		System.out.println("Account Number : "+sb.accNo);
		sb.calculateInterest();
		
		
	}
}
