package core_23_12_24_2;

public class Test {
	public static void main(String[] args) {
		A revStr = (input)->{
			StringBuilder reversed = new StringBuilder(input);
			return reversed.reverse().toString();
		};
		
		String Original = "Hello World";
		String Reversed = revStr.manipulate(Original);
		
		System.out.println("Original String : "+Original);
		System.out.println("Reversed String : "+Reversed);
	}
}
