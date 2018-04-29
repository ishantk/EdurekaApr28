import java.util.Scanner; // YET TO BE EXPLORED

public class Methods {

	// Method : Non Static Method
	void addNums(int num1, int num2){
		int num3 = num1+num2;
		System.out.println("Addition of "+num1+" and "+num2+" is: "+num3);
	}
	
	int squareOfNum(int num){
		int sq = num*num;
		return sq; // ack, which is the last statement
	}

	// Method : Static Method
	static void calculateArea(int lenght, int breadth){
		int area = lenght * breadth;
		System.out.println("Area with length "+lenght+" and breadth "+breadth+" is: "+area);
	}
	
	static double calculateAreaCircle(double radius){
		double area = 3.14 * radius * radius;
		return area;
	}
	
	public static void main(String[] args) {
		
		// Execution of a Method : Non Static, we need an Object
		Methods anyName = new Methods(); // Object Construction Statement (YET TO BE EXPLORED)
		anyName.addNums(10, 20);
		anyName.addNums(100, 200);
		anyName.addNums(17, 15);
		
		int result = anyName.squareOfNum(5);
		System.out.println("Result is: "+result);

		// Execution of a Static Method : Non Static, we dont need an Object, we use the class name
		Methods.calculateArea(12, 15);
		Methods.calculateArea(11, 11);
		Methods.calculateArea(21, 12);
		
		// Scanner | API | Application Programming Interfaces | Built In Code
		Scanner scanner = new Scanner(System.in); // With the Scanner we can take inputs from User
		System.out.println("Please Enter Radius: ");
		double radius = scanner.nextDouble();
		
		
		double area = Methods.calculateAreaCircle(radius);
		System.out.println("Area is: "+area);
		
	}

}
