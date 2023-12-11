package core_9_12_23;

//1.Create a class Area with the following attributes
//
//Instance Variables:
//
//Length: double private
//Width: double private
//Radious: double private
//
//generate non parametarised constructor initilize default values
//Create Parametarised constructor with two prameters length width and create another parametarised constructor with one parameter radious
//
//Methods:
//Name:AreaofRectangle
//ReturnType: double
//accessmodifier:public
//
//Name:AreaofCircle
//ReturnType: double
//accessmodifier:public
//
//Create another class ShapeAreas
//
//create object for Area class pass the values of rectangle length and widthn and print the area of rectangle
//
//create another object for Area class pass the value of circle radious and print the area of circle
//
//user has to enter the values.
//
//-----------------------------------------------------------------------------------------------------

//import java.util.Scanner;
//class Area {
//	double Length;
//	double Width;
//	double Radious;
//
//	Area() {
//		Length = 0;
//		Width = 0;
//		Radious = 0;
//	}
//
//	Area(double L, double W) {
//		this.Length = L;
//		this.Width = W;
//	}
//
//	Area(double R) {
//		this.Radious = R;
//	}
//
//	public double AreaofRectangle() {
//		return Length * Width;
//	}
//
//	public double AreaofCircle() {
//		return (22/7)*(Radious*Radious);
//	}
//
//}
//
//public class A{
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		
//		Area init = new Area();
//		System.out.println("Enter Length and Width of a Rectangle : ");
//		Area rect = new Area(sc.nextDouble(),sc.nextDouble());
//		System.out.println("Enter Radious of a Circle : ");
//		Area circ = new Area(sc.nextDouble());
//		System.out.println("Area of Rectangle : "+rect.AreaofRectangle());
//		System.out.println("Area of Circle : "+circ.AreaofCircle());
//		
//	}
//}

//====================================================================================


//2.Create an class Car with the following attributes
//
//Instance Variables:
//
//CarModel:string public
//Color:string public
//CarNumber:int public(last 4 digit number)
//ModelYear:int public
//
//Generate toString Method and return the details of Car.
//
//Create a class constructor must initialize carmodel,color,carnumber and modelyear 
//
//Create another class CarDetails
//
//create object for Car class pass the values by using constructor 
//User has to enter the values.
//---------------------------------------------------------------------------------------

//import java.util.Scanner;
//class Car{
//	public String CarModel;
//	public String Color;
//	public int CarNumber;
//	public int ModelYear;
//	
//	Car(String CarModel , String Color ,int CarNumber ,int ModelYear){
//		this.CarModel = CarModel;
//		this.Color = Color;
//		this.CarNumber = CarNumber;
//		this.ModelYear = ModelYear;
//	}
//	
//	public String toString() {
//		return "Car Model : "+CarModel+"\nCar Color : "+Color+"\nCar Number : "+CarNumber+"\nCar Model Year : "+ModelYear;
//	}
//}
//
//class A{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Car Model : ");
//		String CModel = sc.nextLine();
//		System.out.println("Enter Car Color : ");
//		String CColor = sc.nextLine();
//		System.out.println("Enter Car Number : ");
//		int CNumber = sc.nextInt();
//		System.out.println("Enter Car Model Year : ");
//		int CYear = sc.nextInt();
//		Car c = new Car( CModel,CColor,CNumber,CYear);
//		System.out.println(c.toString());
//	}
//}



