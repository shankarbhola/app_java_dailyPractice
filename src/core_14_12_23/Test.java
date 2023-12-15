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

//class LibraryItem{
//	public String Title;
//	public String Author;
//	public int Year;
//	public boolean CheckOut;
//	
//	public LibraryItem(String Title, String Author, int Year, boolean CheckOut) {
//		this.Title = Title;
//		this.Author = Author;
//		this.Year = Year;
//		this.CheckOut = CheckOut;
//	}
//	public void DisplayInfo() {
//		System.out.println("Title : "+Title);
//		System.out.println("Author : "+Author);
//		System.out.println("Year : "+Year);
//		System.out.println("Check Out : "+CheckOut);
//	}
//}
//
//class Book extends LibraryItem{
//	public String Genre;
//	public Book(String Title, String Author, int Year, boolean CheckOut, String Genre) {
//		super(Title, Author, Year, CheckOut);
//		this.Genre = Genre;
//	}
//	public void DisplayInfo() {
//		super.DisplayInfo();
//		System.out.println("Genere : "+Genre);
//		
//	}
//}
//
//class DVD extends LibraryItem{
//	public String Director;
//	public DVD(String Title, String Author, int Year, boolean CheckOut, String Director) {
//		super(Title, Author, Year, CheckOut);
//		this.Director = Director;
//	}
//	public void DisplayInfo() {
//		super.DisplayInfo();
//		System.out.println("Director : "+Director);
//		
//	}
//}
//public class Test {
//	public static void main(String[] args) {
//		System.out.println("Book");
//		System.out.println("-----------------------------------");
//		Book b = new Book("Full Stack Java", "Pankaj Sir",2023 ,true, "Programming");
//		b.DisplayInfo();
//		System.out.println("-----------------------------------");
//		System.out.println("DVD");
//		System.out.println("-----------------------------------");
//		DVD d = new DVD("Manual & Automation Testing", "Pankaj P Mutha", 2022, true,"Mr. Pankaj");
//		d.DisplayInfo();
//		System.out.println("-----------------------------------");
//	}
//}

//Question 2:
//-------------
//Create a base class name Animal should have the following properties:
//
//Instance variables:
//Name(string public),age(int public) initilize using parametaried constructor
//
//Methods:
//Method Name:MakeSound
//return type:void
//acessmodifier:public
//Write code to print the animal sound
//
//Method Name:Move
//return type:void
//acessmodifier:public
//Write code to print animal moment
//
//methodname:DisplayInfo
//return type :void
//acessmodifier:public
//write code to display the information
//
//Create a sub class for Animal class name as Dog should have the following properties:
//
//Instance variable:
//
//Breed (string public)
//
//Initilize name,age and breed using parametaried contructor
//
//override all the methods from base class and write logic for all the methods.
//
//Create a sub class for Animal class name as Bird should have the following properties:
//
//Instance variable:
//
//Species (string public)
//
//Initilize name,age and species using parametaried contructor
//
//override all the methods from base class and write logic for all the methods.
//
//Create main class name as Test 
//create object for Dog and Bird pass the values using constructor
//call the MakeSound,Move and DisplayInfo methods of each class.

class Animal {
	public String Name;
	public int Age;

	Animal(String Name, int Age) {
		this.Name = Name;
		this.Age = Age;
	}

	public void MakeSound() {
		System.out.println("Sounding...");
	}

	public void Move() {
		System.out.println("Moving...");
	}

	public void DisplayInfo() {
		System.out.println("Name : " + Name);
		System.out.println("Age : " + Age);
		MakeSound();
		Move();
	}
}

class Dog extends Animal {
	public String Breed;

	Dog(String Name, int Age, String Breed) {
		super(Name, Age);
		this.Breed = Breed;
	}

	public void DisplayInfo() {
		super.DisplayInfo();
		System.out.println("Breed : " + Breed);
	}

}

class Bird extends Animal {
	public String Species;

	Bird(String Name, int Age, String Species) {
		super(Name, Age);
		this.Species = Species;
	}

	public void DisplayInfo() {
		super.DisplayInfo();
		System.out.println("Species : " + Species);
	}

}

public class Test {
	public static void main(String[] args) {
		Dog d = new Dog("Tommy", 10, "Golden Retriever");
		d.DisplayInfo();
		System.out.println("----------------------");
		Bird b = new Bird("Mitu", 3, "parrot");
		b.DisplayInfo();
	}
}
