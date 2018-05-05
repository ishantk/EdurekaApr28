
public class CTP {
	
	// OVERLOADING : Use Same Fnction name with different signature
	void fun(){
		System.out.println("This is fun");
	}
	
	/*int fun(){
		System.out.println("This is fun");
		return 100;
	}*/
	
	
	void fun(int a){
		System.out.println("This is fun again and a is: "+a);
	}
	
	void fun(int a, int b){
		System.out.println("This is fun again and a is: "+a+" and b is: "+b);
	}
	
	void fun(double a){
		System.out.println("This is fun again and a is: "+a);
	}
	
	void fun(char a){
		System.out.println("This is fun again and a is: "+a);
	}
	
	void fun(double a, double b){
		System.out.println("This is fun again and a is: "+a+" and b is: "+b);
	}
	
	void fun(int a, double b){
		System.out.println("This is fun again and a is: "+a+" and b is: "+b);
	}
	
	void fun(double a, int b){
		System.out.println("This is fun again and a is: "+a+" and b is: "+b);
	}
	
	// RULES TO OVERLOAD : Always must have unique and different inputs
	// 1. Method name should be same
	// 2. Inputs must be different
		// 2.1 Number of Inputs (Increase or Decrease)
		// 2.2 Type of Inputs
		// 2.3 Sequence of inputs
	// 3. Return Type i.e. Ack has no role to play
	
	void show(){
		System.out.println("This is show");
	}
	
	void area(double radius){
		double a = 3.14 * radius * radius;
		System.out.println("Area of Circle with radius "+radius+" is "+a);
	}
	
	void area(int lenght, int breadth){
		int a = lenght * breadth;
		System.out.println("Area of Rectangle with length "+lenght+" and breadth "+breadth+" is "+a);
	}
	
	public static void main(int a) {
		
	}

	public static void main(String[] args) {
		
		// Compile Time Polymophism or Static Polymorphism or Static binding or Early binding
		// binding is linking the method's call to its definition
		
		CTP c = new CTP(); // Object Construction Statement
		c.fun(); // compiler at compile time will link this call to the definition
		c.fun(10);
		c.fun(10, 20);
		
		c.fun('A');
		
		c.fun(2.2);
		c.fun(10, 2.2);
		c.fun(2.2, 20);
		
		c.show();
		
		System.out.println("==========================");
		
		c.area(2.2);
		c.area(10, 20);

	}

}
