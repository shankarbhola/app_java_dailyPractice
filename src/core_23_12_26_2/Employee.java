package core_23_12_26_2;

public abstract class Employee {
	public String companyName;
	public String employeeName;
	public double salary;
	
	Employee(String companyName, String employeeName, double salary) {
		this.companyName = companyName;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	public abstract String Details();
	public abstract double CalculateBonus();
}
