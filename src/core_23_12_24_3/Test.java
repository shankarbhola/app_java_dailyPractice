package core_23_12_24_3;

public class Test {
	public static void main(String[] args) {
	
		CtoF ctof = (celsius)->{
			return (celsius * 9/5) + 32;
		};
		
		FtoC ftoc = (fahrenheit)->{
			return (fahrenheit - 32) * 5/9;
		};
		
		double TempInC = 30;
		double TempCtoF = ctof.convert(TempInC);
		
		double TempInF = 60;
		double TempFtoC = ftoc.convert(TempInF);
		
		System.out.println("Temperature in Celsius : "+TempInC+"°C");
		System.out.println("Converted from Celsius to Farenheit : "+TempCtoF+"°F");
		
		System.out.println("");
		
		System.out.println("Temperature in Farenheit : "+TempInF+"°F");
		System.out.println("Converted from Farenheit to Celsius : "+TempFtoC+"°C");
	}
}
