package core_12_12_23;


public class Contractor extends Employee{
	public String ContractDuration;
	public Contractor(int Eid, String Fname, String Lname, String Hdatem, String Cduration) {
		super(Eid, Fname, Lname, Hdatem) ;
		this.ContractDuration = Cduration;
	}
	public void DisplayInfo() {
		super.DisplayInfo();
		System.out.println("Contract Duration: " +ContractDuration);
	}
}