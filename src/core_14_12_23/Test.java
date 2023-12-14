package core_14_12_23;
//Question 1:
//------------
//Create a base class name LibraryItem should have the following properties:
//
//Instance variables:
//
//Title(string public),Author(string public),Year(int public),CheckOut(bool public) 
//Create a parametarised constructor
//
//Methods:
//methodname:DisplayInfo
//return type :void
//acessmodifier:public
//write code to display the information
//
//Create a sub class name as Book should have the following properties:
//
//Instance variable:
//
//Genre string public
//create a parametarised constructor including base class constructor
//
//override DisplayInfo method 
//write code to display details of base class and sub class
//
//Create a sub class name as DVD should have the following properties:
//
//Instance variable:
//
//Director string public
//create a parametarised constructor including base class constructor
//
//override DisplayInfo method 
//write code to display details of base class and sub class
//
//Create main class name as Test 
//create object for Book and DVD pass the values using constructor
//call the DisplayInfo method of each class.

class LibraryItem{
	public String Title;
	public String Author;
	public int Year;
	public boolean CheckOut;
	
	public LibraryItem(String Title, String Author, int Year, boolean CheckOut) {
		this.Title = Title;
		this.Author = Author;
		this.Year = Year;
		this.CheckOut = CheckOut;
	}
	public void DisplayInfo() {
		System.out.println("Title : "+Title);
		System.out.println("Author : "+Author);
		System.out.println("Year : "+Year);
		System.out.println("Check Out : "+CheckOut);
	}
}

class Book extends LibraryItem{
	public String Genre;
	public Book(String Title, String Author, int Year, boolean CheckOut, String Genre) {
		super(Title, Author, Year, CheckOut);
		this.Genre = Genre;
	}
	public void DisplayInfo() {
		super.DisplayInfo();
		System.out.println("Genere : "+Genre);
		
	}
}

class DVD extends LibraryItem{
	public String Director;
	public DVD(String Title, String Author, int Year, boolean CheckOut, String Director) {
		super(Title, Author, Year, CheckOut);
		this.Director = Director;
	}
	public void DisplayInfo() {
		super.DisplayInfo();
		System.out.println("Director : "+Director);
		
	}
}
public class Test {
	public static void main(String[] args) {
		System.out.println("Book");
		System.out.println("-----------------------------------");
		Book b = new Book("Full Stack Java", "Pankaj Sir",2023 ,true, "Programming");
		b.DisplayInfo();
		System.out.println("-----------------------------------");
		System.out.println("DVD");
		System.out.println("-----------------------------------");
		DVD d = new DVD("Manual & Automation Testing", "Pankaj P Mutha", 2022, true,"Mr. Pankaj");
		d.DisplayInfo();
		System.out.println("-----------------------------------");
	}
}
