package core_12_12_23;
//1.Create a base class name Employee should have the following properties:
//
//Instance variables:
//
//EmployeeId int public
//FirstName string public
//LastName string public
//HireDate Sting public
//Create parametariesd constructor
//
//Methods:
//methodname:DisplayInfo
//return type :void
//acessmodifier:public
//write code to display the information
//
//Create a sub class name as FullTimeEmployee should have the following properties:
//
//Instance variable:
//
//Salary double public
//create a parametarised constructor including base class constructor
//
//override DisplayInfo method 
//write code to display details of base class and sub class
//
//Create a sub class name as PartTimeEmployee should have the following properties:
//
//Instance variable:
//
//HourlyRate double public
//create a parametarised constructor including base class constructor
//
//override DisplayInfo method 
//write code to display details of base class and sub class
//
//Create a sub class name as Contractor should have the following properties:
//
//Instance variable:
//
//ContractDuration string public
//
//override DisplayInfo method 
//write code to display details of base class and sub class
//
//Create main class name as Test 
//create object for FullTimeEmployee,PartTimeEmployee and Contractor  pass the values using getters and setters
//call the DisplayInfo method of each class.


public class A {
	public static void main(String[] args) {
		FullTimeEmployee fte = new FullTimeEmployee(1, "Bhola", "Shankar", "13/12/23", 30000.00);
		PartTimeEmployee pte = new PartTimeEmployee(2, "Shankar", "Bhola", "30/11/23", 3.5);
		Contractor ctr = new Contractor(3, "Radhe" ," Krishna", "04/09/23", "2 year");
		
		System.out.println("Full Time Employee Details :");
		fte.DisplayInfo();
		System.out.println("-----------------------------");
		System.out.println("Part Time Employee Details :");
		pte.DisplayInfo();
		System.out.println("-----------------------------");
		System.out.println("Contractor Employee Details :");
		ctr.DisplayInfo();

	}
}