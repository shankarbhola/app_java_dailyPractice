package core_22_12_23;

public class Book implements IOnlineShopping, IProduct{
	public String Title;
	public double Price;
	public String Quality;
	
	@Override
	public String GetBrand() {
		return "Title : "+Title;
	}

	@Override
	public String GetPrice() {
		return "Price : $"+Price;
	}

	@Override
	public String GetQuality() {
		return "Quality : "+Quality;
	}
	
	public void SetBrand(String Title) {
		this.Title = Title;
	}
	public void SetPrice(double Price) {
		this.Price = Price;
	}
	public void SetQuality(String Quality) {
		this.Quality = Quality;
	}

	@Override
	public void AppName(String name) {
		System.out.println("Title : "+Title);
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
