package core_23_12_26;

public class Car extends Vehicle {
	int maxSpeed;
	String companyName;
	String fuelType;
	public String carType;
	public double price;

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String Details() {
		return "Car Details : \nMax Speed : " + maxSpeed+" kmph" + "\nCompany Name : " + companyName + "\nFuel Type : "
				+ fuelType + "\nCar Type : " + carType + "\nPrice : ₹" + price+" lakh";
	}

	@Override
	public double UpdatePrice(double newPrice) {

		return newPrice;
	}

}
