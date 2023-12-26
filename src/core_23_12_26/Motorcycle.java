package core_23_12_26;

public class Motorcycle extends Vehicle{
	int maxSpeed;
	String companyName;
	public String bikeType;
	public double price;
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setCarType(String bikeType) {
		this.bikeType = bikeType;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void gettMaxSpeed() {
		System.out.println(maxSpeed);
	}
	public void getCompanyName() {
		System.out.println(companyName);
	}
	public void getCarType() {
		System.out.println(bikeType);
	}
	public void getPrice() {
		System.out.println(price);
	}

	@Override
	public String Details() {
		return "Bike Details : \\nMax Speed : "+maxSpeed+"\\nCompany Name : "+companyName+ "\\nBike Type : "+bikeType+"\\nPrice : "+price;
	}

	@Override
	public double UpdatePrice(double newPrice) {
		
		return newPrice;
	}

}
