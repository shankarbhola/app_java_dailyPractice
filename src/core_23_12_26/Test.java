package core_23_12_26;

public class Test {
	public static void main(String[] args) {
		Car car = new Car(); 
		car.setMaxSpeed(200);
		car.setCompanyName("Toyota");
		car.setFuelType("Diesel");
		car.setCarType("Fortuner");
		car.setPrice(33.43);
		
		System.out.println(car.Details());
		System.out.println("New Updated Price : ₹"+car.UpdatePrice(35.65)+" lakh");
		
	}
}
