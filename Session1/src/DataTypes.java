
public class DataTypes {

	public static void main(String[] args) {
		
		int a = 100; // Data Storage
		int b = 200;
		int c = a+b; // Data Operation
		
		System.out.println("c is: "+c);
		System.out.println(a+" and "+b+" sums to "+c);
		
		float radius = 10.12f;
		float area = 3.14f * radius * radius;
		System.out.println("Circle with radius "+radius+" has an area "+area);
		
		//char ch = 'A';
		//char ch = 67;     // ASCII Code
		char ch = '\u0905'; // UNICODE
		System.out.println("ch is: "+ch);
		
		boolean isInternetConnected = true;
		boolean isGPSConnected = false;
		
		int var = 10;
		var = 100; // Data can be modified in the container anytime
		var++; // var = var+1;
		
		System.out.println("var is "+var);
		
		
		char ch1 = 'A';
		ch1 = 'Z';
		
		boolean isNetOn = false;
		isNetOn = true;
		
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(num1 < num2);
		
		
	}

}
