package core_23_12_12;

public class PartTimeEmployee extends Employee {
	private double HourlyRate;

	PartTimeEmployee(int Eid, String Fname, String Lname, String Hdatem, double Hrate) {
		super(Eid, Fname, Lname, Hdatem);
		this.HourlyRate = Hrate;
	}

	public void DisplayInfo() {
		super.DisplayInfo();
		System.out.println("Hourly Rate : " + HourlyRate);
	}
}