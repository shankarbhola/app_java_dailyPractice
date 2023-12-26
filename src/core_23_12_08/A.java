package core_23_12_08;


//1.Write a class with a default constructor and display a message inside it.

//public class A {
//	A() {
//		System.out.println("Hello World!");
//	}
//	public static void main(String[] args) {
//		A a1 = new A();
//	}
//
//}

//2. Create a class with a parameterized constructor to initialize instance variables.
//Implement method overloading in constructors by creating multiple constructors with
//different parameters.

//public class A {
//	int x;
//	String y;
//	A(int A , String B){
//		this.x = A;
//		this.y = B;
//	}
//	A(int A){
//		this(A, "DefaultStringValue");
//	}
//	A(){
//		this(0, "DefaultStringValue");
//	}
//	
//	
//	public void disp() {
//		System.out.println("Int value : "+x);
//		System.out.println("String value : "+y);
//	}
//	public static void main(String[] args) {
//		A a1=new A(5,"Hello");
//		a1.disp();
//		A a2 = new A(10);
//		a2.disp();
//		A a3 = new A();
//		a3.disp();
//	}
//}

//3.Create a class with a default constructor and another constructor that takes an integer
//parameter to initialize an instance variable.

//4.Demonstrate the use of this keyword inside a constructor.

//class A{
//	int x;
//	A(){
//		
//	}
//	
//	A(int A){
//		this.x = A;
//	}
//	public void disp() {
//		System.out.println("Value of X : "+x);
//	}
//	
//	public static void main(String[] args) {
//		A a1 = new A();
//		A a2 = new A(10);
//		a2.disp();
//	}
//}

//5.Create a class with a constructor that calls another constructor using this() keyword.
//Design a class with private instance variables and initialize them using a constructor.

//class A {
//	private int x;
//
//	A() {
//		this(10);
//	}
//
//	A(int A) {
//		this.x = A;
//	}
//
//	public void disp() {
//		System.out.println(x);
//	}
//	public static void main(String[] args) {
//		A a1 = new A();
//		a1.disp();
//
//	}
//
//}
