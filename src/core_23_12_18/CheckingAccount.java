package core_23_12_18;

public class CheckingAccount extends Account{
double overdraftLimit = 10000;
public void withdraw() {
	System.out.println("Total available overdraft Amt : "+(10000-2500));
}
public static void main(String[] args) {
	CheckingAccount ca = new CheckingAccount();
	System.out.println("Account Number : "+ca.accNo);
	System.out.println("Total overdraft limit : "+ca.overdraftLimit);
	ca.withdraw();
}
}
