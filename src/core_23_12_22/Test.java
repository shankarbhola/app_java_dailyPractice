package core_23_12_22;

public class Test{
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		System.out.println("Laptop Details :");
		laptop.SetBrand("HP");
		laptop.SetPrice(1200.5);
		laptop.SetQuality("High");
		
		System.out.println(laptop.GetBrand());
		System.out.println(laptop.GetPrice());
		System.out.println(laptop.GetQuality());
		laptop.AppName("Flipkart");
		laptop.AddCart();
		laptop.Checkout();
		
		System.out.println("");
		Book book = new Book();
		book.SetBrand("The Catcher in the Rye");
		book.SetPrice(15.9);
		book.SetQuality("Medium");
		
		System.out.println(book.GetBrand());
		System.out.println(book.GetPrice());
		System.out.println(book.GetQuality());
		book.AppName("Amazon");
		book.AddCart();
		book.Checkout();
		
		
	}
}
