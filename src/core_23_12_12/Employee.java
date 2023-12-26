package core_23_12_12;

public class Employee {
	public int EmployeeId;
	public String FirstName;
	public String LastName;
	public String HireDate;

	Employee(int Eid, String Fname, String Lname, String Hdate) {
		this.EmployeeId = Eid;
		this.FirstName = Fname;
		this.LastName = Lname;
		this.HireDate = Hdate;
	}

	public void DisplayInfo() {
		System.out.println("Employee Id : " + EmployeeId);
		System.out.println("Name :" + FirstName + " " + LastName);
		System.out.println("Hire Date : " + HireDate);
	}

}