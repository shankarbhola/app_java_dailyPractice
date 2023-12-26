package core_23_12_24;

public class Test{
	
	public static void main(String[] args) {
		A square = (int x) -> {
			return x*x;
		};
		A cube = (x) -> {
			return x * x * x;
		} ;

		System.out.println("Square Result : "+square.performOperation(5));
		System.out.println("Cube Result : "+cube.performOperation(3));
	}
	
}

