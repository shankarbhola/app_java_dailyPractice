package core_23_12_22;

public class Laptop implements IOnlineShopping , IProduct{
	public String Brand;
	public double Price;
	public String Quality;
	
	@Override
	public String GetBrand() {
		return "Brand : "+Brand;
	}

	@Override
	public String GetPrice() {
		return "Price : $"+Price;
	}

	@Override
	public String GetQuality() {
		return "Quality : "+Quality;
	}
	
	public void SetBrand(String Brand) {
		this.Brand = Brand;
	}
	public void SetPrice(double Price) {
		this.Price = Price;
	}
	public void SetQuality(String Quality) {
		this.Quality = Quality;
	}

	@Override
	public void AppName(String name) {
		System.out.println("Online Shopping App Name : "+name);
	}

	@Override
	public void AddCart() {
		System.out.println("Item added to the cart.");
	}

	@Override
	public void Checkout() {
		System.out.println("Checkout completed.");
	}

}
