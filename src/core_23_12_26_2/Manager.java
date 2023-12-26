package core_23_12_26_2;

public class Manager extends Employee{

	Manager(String companyName, String employeeName, double salary) {
		super(companyName, employeeName, salary);
	}

	@Override
	public String Details() {
		return "Manager Details :\nCompany Name : "+companyName+"\nEmployee Name : "+employeeName+"\nSalary : ₹"+salary;
	}

	@Override
	public double CalculateBonus() {
		double bonous = 0.1*salary;
		return bonous;
	}

}
