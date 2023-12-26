package core_23_12_26_2;

public class Test {
	public static void main(String[] args) {
		Manager manager = new Manager("TCS", "Raghav", 50000);
		System.out.println(manager.Details());
		System.out.println("Bonus : ₹"+manager.CalculateBonus());
		
		System.out.println("");
		
		Developer developer = new Developer("IBM", "Nandini", 35000, 6);
		System.out.println(developer.Details());
		System.out.println("Bonus : ₹"+developer.CalculateBonus());
		
		System.out.println("");
		
		Tester tester = new Tester("wipro", "Subham", 37000, 8);
		System.out.println(tester.Details());
		System.out.println("Bonus : ₹"+tester.CalculateBonus());
		
	}
}
