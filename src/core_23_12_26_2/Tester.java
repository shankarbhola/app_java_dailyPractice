package core_23_12_26_2;

public class Tester extends Employee{
	public int WorkExperience;
	
	Tester(String companyName, String employeeName, double salary, int WorkExperience) {
		super(companyName, employeeName, salary);
		this.WorkExperience = WorkExperience;
	}

	@Override
	public String Details() {
		return "Tester Details :\nCompany Name : "+companyName+"\n Employee Name : "+employeeName+"\nSalary : ₹"+salary+"\nWork Experience : "+WorkExperience+" year";
	}

	@Override
	public double CalculateBonus() {
		double bonous;
		if (WorkExperience>5) {
			bonous = 0.25*salary;
		} else {
			bonous = 0.10*salary;
		}
		return bonous;
	}

}
