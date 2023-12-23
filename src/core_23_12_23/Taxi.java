package core_23_12_23;

public class Taxi implements Ilocation, ITaxiBooking{
	String pickupLocation;
	String dropLocation;
	
	public void SetPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public void SetDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	
	@Override
	public void BookingApp(String name) {
		System.out.println("Taxi Booking App : "+name);
	}

	@Override
	public String GetPickupLocation() {
		return "Pickup Location : "+pickupLocation;
	}

	@Override
	public String GetDropLocation() {
		return "Drop Location : "+dropLocation;
	}

	@Override
	public void ConfirmBooking() {
			System.out.println("Booking Confirmed. Taxi in route.");
	}

}
