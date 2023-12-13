package core_12_12_23;

public class FullTimeEmployee extends Employee {
	public double Salary;

	FullTimeEmployee(int Eid, String Fname, String Lname, String Hdatem, double sal) {
		super(Eid, Fname, Lname, Hdatem);
		this.Salary = sal;
	}

	public void DisplayInfo() {
		super.DisplayInfo();
		System.out.println("Salary : " + Salary);
	}
}