package core_15_12_23;
//1.Create a base class name Product should have the following properties:

//
//Instance variables:
//Name(string public)
//Price(double public)
//StockQuantity(int public)
//
//create a parametarised constructor and initilize all the variables
//
//Methods:
//methodname:DisplayInfo
//return type :void
//acessmodifier:public
//write code to display the information
//
//Create a sub class for Product class name as Electronics should have the following properties:
//
//Instance variable:
//
//Brand(string public)
//Model(string public)
//
//Initilize name,Price,StockQuantity,Brand and Model using parametaried contructor
//
//override the DisplayInfo method from base class and write logic for the method.
//
//
//Create a sub class for Product class name as Clothing should have the following properties:
//
//Instance variable:
//
//Size(string public)
//Color(string public)
//
//Initilize name,Price,StockQuantity,Size and Color using parametaried contructor
//
//override the DisplayInfo method from base class and write logic for the method.
//
//Create main class name as Test 
//create object for Electronics and Clothing pass the values using constructor
//call the DisplayInfo method of each class.

class Product {
	public String Name;
	public double Price;
	public int StockQty;

	public Product(String Name, double Price, int StockQty) {
		this.Name = Name;
		this.Price = Price;
		this.StockQty = StockQty;
	}

	public void DisplayInfo() {
		System.out.println("Name : " + Name);
		System.out.println("Price : " + Price);
		System.out.println("Stock Qty : " + StockQty);
	}
}

class Electronics extends Product {
	public String Brand;
	public String Model;

	public Electronics(String Name, double Price, int StockQty, String Brand, String Model) {
		super(Name, Price, StockQty);
		this.Brand = Brand;
		this.Model = Model;
	}

	@Override
	public void DisplayInfo() {
		super.DisplayInfo();
		System.out.println("Brand : " + Brand);
		System.out.println("Model : " + Model);
	}
}

class Clothing extends Product {
	public String Size;
	public String Color;

	public Clothing(String Name, double Price, int StockQty, String Size, String Color) {
		super(Name, Price, StockQty);
		this.Size = Size;
		this.Color = Color;
	}

	@Override
	public void DisplayInfo() {
		super.DisplayInfo();
		System.out.println("Size : " + Size);
		System.out.println("Color : " + Color);
	}

}

public class Test {
	public static void main(String[] args) {
		Electronics e = new Electronics("Led Bulb", 350.00, 2, "Bajaj", "Bulb_1");
		e.DisplayInfo();
		System.out.println("----------------");
		Clothing c = new Clothing("White Shirt", 2200.00, 3, "Allen Solly", "As_5");
		c.DisplayInfo();
	}
}
