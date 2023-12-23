package core_23_12_23;

public class Test {
	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		System.out.println("Taxi Booking Details :");
		taxi.SetPickupLocation("Airport");
		taxi.SetDropLocation("City Center");
		
		System.out.println(taxi.GetPickupLocation());
		System.out.println(taxi.GetDropLocation());
		taxi.BookingApp("OLA");
		taxi.ConfirmBooking();
	}
}
