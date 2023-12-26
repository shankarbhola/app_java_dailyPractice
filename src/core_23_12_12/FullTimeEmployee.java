package core_23_12_12;

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